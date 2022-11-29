package Driver;

import java.sql.Connection;
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
    private static PreparedStatement insertBooking = null;
    private static PreparedStatement insertBookingInfo = null;

    public static void createProcedures(Connection con) throws SQLException{    

        insertSchedule = con.prepareStatement("{call dbo.add_schedule(?, ?, ?, ?, ?, ?)}");
        insertPilot = con.prepareStatement("{call dbo.add_pilot(?, ?)}");
        insertPlane = con.prepareStatement("{call dbo.add_plane(?, ?,?)}");
        insertPassenger = con.prepareStatement("{call dbo.add_passenger(?, ?)}");
        insertLocation = con.prepareStatement("{call dbo.add_location(?, ?)}");
        insertRoute = con.prepareStatement("{call dbo.add_route(?, ?)}");
        insertStatus = con.prepareStatement("{call dbo.add_status(?, ?)}");
        insertBooking = con.prepareStatement("{call dbo.add_booking(?,?,?,?)}");
        insertBookingInfo = con.prepareStatement("{call dbo.add_booking_info(?,?,?)}");
    }

    public static void addPassenger(String name, String email){
        try{
            insertPassenger.setString(1, email);
            insertPassenger.setString(2, name);

            insertPassenger.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addSchedule(Integer planeId, Integer routeId, String startTime, String endTime, Integer pilotId, String status){
        try{
            insertSchedule.setInt(1, planeId);
            insertSchedule.setInt(2, routeId);
            insertSchedule.setString(3, startTime);
            insertSchedule.setString(4, endTime);
            insertSchedule.setInt(5, pilotId);
            insertSchedule.setString(6, status);
            insertSchedule.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addPilot(String name, Double salary){
        try{
            insertPilot.setString(1, name);
            insertPilot.setDouble(2, salary);

            insertPilot.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addPlane(String model, String manufacturer, Integer capacity){
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

    public static void addRoute(String start_location, String end_location){
        try{
            insertRoute.setString(1, start_location);
            insertRoute.setString(2, end_location);
            insertRoute.execute();
            //System.out.println("Succesfull Insertion of Records");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addLocation(String airport_name, Integer capacity){
        try{
            insertLocation.setString(1, airport_name);
            insertLocation.setInt(2, capacity);

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

    public static void addBooking(Integer schedule_id, String className, String email, String seatNum){
        try{
            insertBooking.setInt(1, schedule_id);
            insertBooking.setString(2, className);
            insertBooking.setString(3, email);
            insertBooking.setString(4, seatNum);

            insertBooking.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void addBookingInfo(Integer schedule_id, String className, Double price){
        try{
            insertBookingInfo.setInt(1, schedule_id);
            insertBookingInfo.setString(2, className);
            insertBookingInfo.setDouble(3, price);

            insertBookingInfo.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }
}
