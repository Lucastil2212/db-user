package Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.lang.Integer;
public class UpdateProcedure {

    private static PreparedStatement updateSchedule = null;
    private static PreparedStatement updatePilot = null;
    private static PreparedStatement updatePlane = null;
    private static PreparedStatement updatePassenger = null;
    private static PreparedStatement updateLocation = null;
    private static PreparedStatement updateRoute = null;
    private static PreparedStatement updateStatus = null;
    private static PreparedStatement updateBooking = null;
    private static PreparedStatement updateBookingInfo = null;

    public static void createProcedures(Connection con) throws SQLException{    

        updateSchedule = con.prepareStatement("{call dbo.update_schedule(?,?, ?, ?, ?, ?, ?)}");
        updatePilot = con.prepareStatement("{call dbo.update_pilot(?,?, ?)}");
        updatePlane = con.prepareStatement("{call dbo.update_plane(?, ?)}");
        updatePassenger = con.prepareStatement("{call dbo.update_passenger(?, ?,?)}");
        updateLocation = con.prepareStatement("{call dbo.update_location(?,?)}");
        updateRoute = con.prepareStatement("{call dbo.update_route(?, ?,?)}");
        updateStatus = con.prepareStatement("{call dbo.update_status(?, ?,?)}");
        updateBooking = con.prepareStatement("{call dbo.update_booking(?,?,?,?,?)}");
        updateBookingInfo = con.prepareStatement("{call dbo.update_booking_info(?,?,?)}");
    }

    public static void updatePassenger(String name, String email,String new_email){
        try{
            updatePassenger.setString(1, email);
            updatePassenger.setString(2, new_email);
            updatePassenger.setString(3,name);
            updatePassenger.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateSchedule(Integer scheduleId , Integer planeId, Integer routeId, String startTime, String endTime, Integer pilotId, String status){
        try{
            updateSchedule.setInt(1,scheduleId);
            if(planeId == null){
                updateSchedule.setNull(2,Types.INTEGER);
            }else{
                updateSchedule.setInt(2, planeId);
            }
            if(routeId == null){
                updateSchedule.setNull(3,Types.INTEGER);
            }else{
                updateSchedule.setInt(3, routeId);
            }
            updateSchedule.setString(4, startTime);
            updateSchedule.setString(5, endTime);
            if(pilotId == null){
                updateSchedule.setNull(6,Types.INTEGER);
            }else{
                updateSchedule.setInt(6, pilotId);
            }
            updateSchedule.setString(7, status);
            updateSchedule.execute();
            
            SQLWarning warning = updateSchedule.getWarnings();
            if(warning == null){
                System.out.println("Sucessful Update of Records.");
            }
            else{
                while (warning != null) {
                    System.out.println("Failure to Update: " + warning.getMessage());
                    warning = warning.getNextWarning();
                    throw new SQLException();
                }
            }
    
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updatePilot(Integer pilotId, String name, Double salary){
        try{
            updatePilot.setInt(1,pilotId);
            updatePilot.setString(2, name);
            if(salary == null){
                updatePilot.setNull(3,Types.DOUBLE);
            }else{
                updatePilot.setDouble(3, salary);
            }
            updatePilot.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updatePlane(Integer planeId, String model, String manufacturer, Integer capacity){
        try{
            updatePlane.setInt(1, planeId);
            updatePlane.setString(2, model);
            updatePlane.setString(3, manufacturer);
            if(capacity == null){
                updatePlane.setNull(4,Types.INTEGER);
            }else{
                updatePlane.setInt(4, capacity);
            }
            updatePlane.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();    
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateRoute(Integer routeID, String start_location, String end_location){
        try{
            updateRoute.setInt(1, routeID);
            updateRoute.setString(2, start_location);
            updateRoute.setString(3, end_location);
            updateRoute.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateLocation(String airport_name, String new_airport_name,Integer capacity){
        try{
            updateLocation.setString(1,airport_name);
            updateLocation.setString(2, new_airport_name);
            if(capacity == null){
                updateLocation.setNull(3,Types.INTEGER);
            }else{
                updateLocation.setInt(3, capacity);
            }
            updateLocation.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateStatus(String status, String new_status, String description){
        try{
            updateStatus.setString(1, status);
            updateStatus.setString(2, new_status);
            updateStatus.setString(3, description);
            updateStatus.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateBooking(Integer booking_id , Integer schedule_id, String className, String email, String seatNum){
        try{
            updateBooking.setInt(1, booking_id);
            if(schedule_id == null){
                updateBooking.setNull(2,Types.INTEGER);
            }else{
                updateBooking.setInt(2, schedule_id);
            }
            updateBooking.setString(3, className);
            updateBooking.setString(4, email);
            updateBooking.setString(5, seatNum);
            updateBooking.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }

    public static void updateBookingInfo(Integer schedule_id, String className, Double price){
        try{
            updateBookingInfo.setInt(1, schedule_id);
            updateBookingInfo.setString(2, className);
            if(price == null){
                updateBookingInfo.setNull(3,Types.DOUBLE);
            }else{
                updateBookingInfo.setDouble(3, price);
            }
            updateBookingInfo.execute();
            System.out.println("Successful Update of Records.");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println("Failure to update record in database re-enter record with Correct Information");
        }
        
    }
}

