package template;

import singleton.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FiltrSQL1 extends AbstractTemplateSQL {


    @Override
    public void showWynik (String Imie) {
        Imie = "Imie";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT "+Imie+" FROM portalpacjenta.doktor");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                System.out.println("Doktor ma "+Imie+" : " + resultSet.getString(Imie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
