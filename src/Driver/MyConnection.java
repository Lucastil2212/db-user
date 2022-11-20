package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class MyConnection{

    private Connection connection = null;
   
    private String connectionUrl = "";
    private String userName = "";
    private String password = "";

    public MyConnection(){
        connectionUrl = 
        "jdbc:sqlserver://localhost;"
        + "database=airport; " //change this
        + "user=dbuser  ;" //change this
        + "password=password;" //change this
        + "encrypt=true;"
        + "trustServerCertificate=true;"
        + "loginTimeout=30;";
    }

    private Connection getConnection(){
        if(this.connection == null){
            throw new IllegalStateException("No connection has been established");
        }

        return this.connection;
    }
    public boolean closeConnection(){
        try{
            this.connection.close();
            return true;
        }catch(Exception e){
            System.out.println();
            return false;
        }
    }

    public NonQueryStatement nonNonQueryStatement(){

    }

    public void connect(){
  
        try(Connection conn = DriverManager.getConnection(connectionUrl);
        ){
              connection = conn;

              System.out.println("CONNECTED");
            //   Statement statement = connection.prepareStatement(password);
        }catch(Exception e){
           e.printStackTrace();
            
        }finally{
            try{connection.close();}catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }    
}