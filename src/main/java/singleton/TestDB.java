package singleton;

import java.sql.*;

public class TestDB {
    public static void testDB() {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM portalpacjenta.doktor where idDoktor='1'");
            PreparedStatement stmt2 = connection.prepareStatement("SELECT * FROM portalpacjenta.pacjent where idPacjenta='1'");
            ResultSet resultSet = stmt.executeQuery();
            ResultSet resultSet2 = stmt2.executeQuery();
            while (resultSet2.next()) {
                System.out.println("Pacjent: " + resultSet2.getString("Imie") + " " + resultSet2.getString("Nazwisko") + " " + resultSet2.getString("PESEL"));
            }
            while (resultSet.next()) {
                System.out.println("Doktor: " + resultSet.getString("Imie") + " " + resultSet.getString("Nazwisko") + " " + resultSet.getString("Stanowisko"));
            }
        } catch (Exception e) {
        }
    }
}
