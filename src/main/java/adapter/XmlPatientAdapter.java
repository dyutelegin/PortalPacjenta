package adapter;

import adapter.model.Patient;
import adapter.parser.XmlPatientParser;

import java.io.File;
import java.util.List;

public class XmlPatientAdapter implements PatientFileStorage {

    private final XmlPatientParser xmlPatientParser;

    public XmlPatientAdapter(XmlPatientParser xmlPatientParser) {
        this.xmlPatientParser = xmlPatientParser;
    }

    @Override
    public List<Patient> getPatients(File file) {
        return xmlPatientParser.parseXml(file);
    }

}
