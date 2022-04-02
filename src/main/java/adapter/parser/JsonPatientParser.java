package adapter.parser;

import adapter.model.Patient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonPatientParser {

    ObjectMapper objectMapper = new ObjectMapper();

    public List<Patient> parseJson(File file) {
        try {
            return objectMapper.readValue(file, new TypeReference<List<Patient>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Can't read file.", e);
        }
    }

}
