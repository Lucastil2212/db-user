package Driver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertProcedure {
    private static PreparedStatement insertSchedule = null;
    private static PreparedStatement insertPilot = null;
    private static PreparedStatement insertPlane = null;
    private static PreparedStatement insertPassenger = null;
    private static PreparedStatement insertLocation = null;
    private static PreparedStatement insertRoute = null;
    private static PreparedStatement insertStatus = null;

    public static void createProcedures(Connection con) throws SQLException{    

        insertSchedule = con.prepareStatement("{call dbo.add_schedule(?, ?, ?, ?, ?, ?)}");
        insertPilot = con.prepareStatement("{call dbo.add_pilot(?, ?)}");
        insertPlane = con.prepareStatement("{call dbo.add_plane(?, ?)}");
        insertPassenger = con.prepareStatement("{call dbo.add_passenger(?, ?)}");
        insertLocation = con.prepareStatement("{call dbo.add_location(?, ?)}");
        insertRoute = con.prepareStatement("{call dbo.add_route(?, ?)}");
        insertStatus = con.prepareStatement("{call dbo.add_status(?, ?)}");
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

    public static void addSchedule(int planeId, int routeId, Date startTime, Date endTime, int pilotId, String status){
        try{
            insertSchedule.setInt(1, planeId);
            insertSchedule.setInt(2, routeId);
            insertSchedule.setDate(3, startTime);
            insertSchedule.setDate(4, endTime);
            insertSchedule.setInt(5, pilotId);
            insertSchedule.setString(6, status);


            insertSchedule.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addPilot(String name, Float salary){
        try{
            insertPilot.setString(1, name);
            insertPilot.setFloat(2, salary);

            insertPilot.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addPlane(String model, String manufacturer, int capacity){
        try{
            insertPlane.setString(1, model);
            insertPlane.setString(2, manufacturer);
            insertPlane.setInt(3, capacity);

            insertPlane.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();    
            System.out.println(e.toString());
        }
        
    }

    public static void addRoute(int start_location, int end_location){
        try{
            insertRoute.setInt(1, start_location);
            insertRoute.setInt(2, end_location);

            insertRoute.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addLocation(String name, int capacity){
        try{
            insertLocation.setString(1, name);
            insertLocation.setInt(3, capacity);

            insertLocation.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addStatus(String status, String description){
        try{
            insertStatus.setString(1, status);
            insertStatus.setString(2, description);

            insertStatus.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }
}
