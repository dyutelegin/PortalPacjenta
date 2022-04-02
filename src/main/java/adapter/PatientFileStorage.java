package adapter;

import adapter.model.Patient;

import java.io.File;
import java.util.List;

public interface PatientFileStorage {

    List<Patient> getPatients(File file);

}
