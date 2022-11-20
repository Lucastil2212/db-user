package Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertProcedure {
    //Statement insertSchedule = null;
    // CallableStatement insertPilot = null;
    // Statement insertPlane = null;
    private static PreparedStatement insertPassenger = null;
    // Statement insertLocation = null;
    // Statement insertRoute = null;
    // Statement insertStatus = null;

    public static void createProcedures(Connection con) throws SQLException{    

        insertPassenger = con.prepareStatement("{call dbo.add_passenger(?, ?)}");
    }

    public static void addPassenger(String name, String email){
        try{
            insertPassenger.setString(1, name);
            insertPassenger.setString(2, email);

            insertPassenger.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

}
