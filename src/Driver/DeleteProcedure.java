package Driver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DeleteProcedure {
    private static PreparedStatement deleteSchedule = null;
    private static PreparedStatement deletePilot = null;
    private static PreparedStatement deletePlane = null;
    private static PreparedStatement deletePassenger = null;
    private static PreparedStatement deleteLocation = null;
    private static PreparedStatement deleteRoute = null;
    private static PreparedStatement deleteStatus = null;

    public static void createProcedures(Connection con) throws SQLException{    

        deleteSchedule = con.prepareStatement("{call dbo.delete_schedule(?, ?, ?, ?, ?, ?)}");
        deletePilot = con.prepareStatement("{call dbo.delete_pilot(?, ?)}");
        deletePlane = con.prepareStatement("{call dbo.delete_plane(?, ?)}");
        deletePassenger = con.prepareStatement("{call dbo.delete_passenger(?, ?)}");
        deleteLocation = con.prepareStatement("{call dbo.delete_location(?, ?)}");
        deleteRoute = con.prepareStatement("{call dbo.delete_route(?, ?)}");
        deleteStatus = con.prepareStatement("{call dbo.delete_status(?, ?)}");
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
}
