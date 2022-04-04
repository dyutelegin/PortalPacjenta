package template;

import singleton.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FiltrSQL3 extends AbstractTemplateSQL{
    @Override
    public void showWynik(String PESEL) {
        PESEL = "PESEL";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT "+PESEL+" FROM portalpacjenta.pacjent");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                System.out.println(PESEL+": " + resultSet.getString(PESEL));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
