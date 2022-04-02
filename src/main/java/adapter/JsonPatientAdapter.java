package adapter;

import adapter.model.Patient;
import adapter.parser.JsonPatientParser;

import java.io.File;
import java.util.List;

public class JsonPatientAdapter implements PatientFileStorage {

    private JsonPatientParser jsonPatientParser;

    public JsonPatientAdapter(JsonPatientParser jsonPatientParser) {
        this.jsonPatientParser = jsonPatientParser;
    }

    @Override
    public List<Patient> getPatients(File file) {
        return jsonPatientParser.parseJson(file);
    }

}
