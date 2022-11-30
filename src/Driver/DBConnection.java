package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnection {

    private static Connection connection;

    private DBConnection(String username, String password){
        String connectionUrl = 
        "jdbc:sqlserver://localhost;"
        + "database=FinalProj; "
        + "user=" + username + ";" 
        + "password=" + password +";"
        + "encrypt=true;"
        + "trustServerCertificate=true;"
        + "loginTimeout=30;";

        try{
              connection = DriverManager.getConnection(connectionUrl);
              InsertProcedure.createProcedures(connection);
              DeleteProcedure.createProcedures(connection);
              UpdateProcedure.createProcedures(connection);
              UseCases.createProcedures(connection);
              System.out.println("You are now connected to the database");
        }catch(Exception e){
              e.printStackTrace();
        }

    }

    public static DBConnection getConnection(String username, String password){
        return new DBConnection(username, password);
    }
}
