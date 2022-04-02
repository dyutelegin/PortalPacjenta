package adapter.parser;

import adapter.model.Patient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlPatientParser {

    private final XmlMapper xmlMapper = new XmlMapper();

    public List<Patient> parseXml(File file) {
        try {
            return xmlMapper.readValue(file, new TypeReference<List<Patient>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Can't parse file.", e);
        }
    }

}
