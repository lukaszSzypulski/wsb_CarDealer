package dealer;

import java.sql.*;

public class DataBaseConnection {



    public void readFromDatabase(String databaseName, String query){
        final String USER = "dealer";
        final String PASSWORD = "dealer123";

        String URL = "jdbc:postgresql://localhost:5432/" + databaseName;

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()){
                    System.out.println(rs.getString(2));
                }
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
