package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    private DBConnection(String username, String password){
        String connectionUrl = 
        "jdbc:sqlserver://localhost;"
        + "database=airport; "
        + "user=" + username + ";" 
        + "password=" + password +";"
        + "encrypt=true;"
        + "trustServerCertificate=true;"
        + "loginTimeout=30;";

        try{
              connection = DriverManager.getConnection(connectionUrl);

              InsertProcedure.createProcedures(connection);
              System.out.println("CONNECTED");
        }catch(Exception e){
           e.printStackTrace();
        }

    }

    public static DBConnection getConnection(String username, String password){
        return new DBConnection(username, password);
    }
}
