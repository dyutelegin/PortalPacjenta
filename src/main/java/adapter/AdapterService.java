package adapter;

import adapter.model.Patient;
import adapter.parser.JsonPatientParser;
import adapter.parser.XmlPatientParser;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdapterService {

    private final Map<String, PatientFileStorage> fileStorages = new HashMap<>();

    public AdapterService() {
        fileStorages.put("json", new JsonPatientAdapter(new JsonPatientParser()));
        fileStorages.put("xml", new XmlPatientAdapter(new XmlPatientParser()));
    }

    public void adapterService(List<File> files) {
        for (File f : files) {
            if (f.isFile()) {
                String[] split = f.getName().split("\\.");
                String extension = split[split.length - 1];
                if (fileStorages.containsKey(extension)) {
                    System.out.println("Patients from file with extension " + extension);
                    List<Patient> patients = fileStorages.get(extension).getPatients(f);
                    patients.forEach(System.out::println);
                }
            }
        }

    }
}
