package template;

import iterator.entity.PatientEntity;
import iterator.list.PatientList;
import singleton.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FiltrSQL2 extends AbstractTemplateSQL {
    @Override
    public void showWynik(String Imie) {
        Connection connection = DatabaseConnection.getConnection();

        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM portalpacjenta.pacjent");
            ResultSet resultSet = stmt.executeQuery();

            var patients = new ArrayList<PatientEntity>();
            while (resultSet.next()) {
                patients.add(new PatientEntity(
                        resultSet.getString("Imie"),
                        resultSet.getString("Nazwisko"),
                        resultSet.getString("PESEL"),
                        resultSet.getString("Adres")
                ));
            }

            var patientList = new PatientList(patients);
            var patientIterator = patientList.createIterator(1);

            while (!patientIterator.done()) {
                System.out.println(patientIterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
