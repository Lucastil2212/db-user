package Driver;

import java.sql.Connection;
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
    private static PreparedStatement deleteBooking = null;
    private static PreparedStatement deleteBookingInfo = null;


    public static void createProcedures(Connection con) throws SQLException{    

        deleteSchedule = con.prepareStatement("{call dbo.delete_schedule(?)}");
        deletePilot = con.prepareStatement("{call dbo.delete_pilot(?)}");
        deletePlane = con.prepareStatement("{call dbo.delete_plane(?)}");
        deletePassenger = con.prepareStatement("{call dbo.delete_passenger(?)}");
        deleteLocation = con.prepareStatement("{call dbo.delete_location(?)}");
        deleteRoute = con.prepareStatement("{call dbo.delete_route(?)}");
        deleteStatus = con.prepareStatement("{call dbo.delete_status(?)}");
        deleteBooking = con.prepareStatement("{call dbo.delete_booking(?)}");
        deleteBookingInfo = con.prepareStatement("{call dbo.delete_boooking_info(?, ?)}");

    }

    public static void removePassenger(String email){
        try{
            deletePassenger.setString(1, email);

            deletePassenger.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeSchedule(Integer planeId){
        try{
            deleteSchedule.setInt(1, planeId);

            deleteSchedule.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removePilot(Integer pilot_id){
        try{
            deletePilot.setInt(1, pilot_id);

            deletePilot.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removePlane(Integer planeId){
        try{
            deletePlane.setInt(1, planeId);

            deletePlane.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();    
            System.out.println(e.toString());
        }
        
    }

    public static void removeRoute(Integer route_id){
        try{
            deleteRoute.setInt(1, route_id);
            deleteRoute.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeLocation(String airport_name){
        try{
            deleteLocation.setString(1, airport_name);
            deleteLocation.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeStatus(String status){
        try{
            deleteStatus.setString(1, status);

            deleteStatus.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

        public static void removeBooking(Integer booking_id){
        try{
            deleteBooking.setInt(1, booking_id);
            deleteBooking.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeBookingInfo(Integer schedule_info, String className){
        try{
            deleteBookingInfo.setInt(1, schedule_info);
            deleteBookingInfo.setString(2, className);
            deleteBookingInfo.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }
}
