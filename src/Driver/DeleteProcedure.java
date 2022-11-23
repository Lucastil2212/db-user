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
        deleteBookingInfo = con.prepareStatement("{call dbo.delete_booking_info(?, ?)}");

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

    public static void removeSchedule(int planeId){
        try{
            deleteSchedule.setInt(1, planeId);

            deleteSchedule.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removePilot(String name){
        try{
            deletePilot.setString(1, name);

            deletePilot.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removePlane(int planeId){
        try{
            deletePlane.setInt(1, planeId);

            deletePlane.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();    
            System.out.println(e.toString());
        }
        
    }

    public static void removeRoute(int start_location){
        try{
            deleteRoute.setInt(1, start_location);

            deleteRoute.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeLocation(String name){
        try{
            deleteLocation.setString(1, name);

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

        public static void removeBooking(int booking_id){
        try{
            deleteBooking.setInt(1, booking_id);

            deleteStatus.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }

    public static void removeBookingInfo(int schedule_info, String className){
        try{
            deleteStatus.setInt(1, schedule_info);
            deleteBookingInfo.setString(2, className);

            deleteStatus.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
        
    }
}
