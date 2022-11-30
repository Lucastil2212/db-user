package Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

public class UseCases {
        private static PreparedStatement useCaseAdminUser = null;
        private static PreparedStatement useCasePilot = null;
        private static PreparedStatement useCase2 = null;
        private static PreparedStatement useCase3 = null;
        private static PreparedStatement useCase4 = null;
        private static PreparedStatement useCase5 = null;
        private static PreparedStatement useCase6 = null;
        private static PreparedStatement useCase7 = null;
        private static PreparedStatement useCase8 = null;
        private static PreparedStatement useCase9 = null;
        private static PreparedStatement useCase10 = null;




        public static void createProcedures(Connection con) throws SQLException{    
            useCaseAdminUser = con.prepareStatement("{call dbo.Use_Case_1_Admin_User(?,?)}");
            useCasePilot = con.prepareStatement("{call dbo.Use_Case_1_Pilot(?,?,?)}");
            useCase2 = con.prepareStatement("{call dbo.use_case_2(?,?)}");
            useCase3 = con.prepareStatement("{call dbo.use_case_3(?,?,?)}");
            useCase4 = con.prepareStatement("{call dbo.use_case_4(?,?,?)}");
            useCase5 = con.prepareStatement("SELECT TOP 1000 pilot_id,name,salary,start_location_id,end_location_id,start_time,end_time,plane_id,status from dbo.allPilots");
            useCase6 = con.prepareStatement("{call dbo.use_case_6(?,?,?,?,?,?,?)}");
            useCase7 = con.prepareStatement("{call dbo.use_case_7(?,?,?,?)}");
            useCase8 = con.prepareStatement("{call dbo.use_case_8(?,?)}");
            useCase9 = con.prepareStatement("{call dbo.use_case_9(?,?,?,?)}");
            useCase10 = con.prepareStatement("{call dbo.use_case_10(?,?)}");

        }
    
        public static void UseCase1AdminUser(String location,String endlocation){
            try{
                useCaseAdminUser.setString(1, location);
                useCaseAdminUser.setString(2, endlocation);
                ResultSet resultSet = useCaseAdminUser.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1) + " " + 
                    resultSet.getString(2) + " " + resultSet.getString(3) + " " 
                    + resultSet.getString(4) + " " + resultSet.getString(5) + " " + 
                    resultSet.getString(6) + " " + resultSet.getString(7));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }
    
        public static void UseCase1Pilot(String location,String endlocation,int pilotId){
            try{
                useCasePilot.setString(1, location);
                useCasePilot.setString(2, endlocation);
                useCasePilot.setInt(3,pilotId);
                ResultSet resultSet = useCaseAdminUser.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1) + " " + 
                    resultSet.getString(2) + " " + resultSet.getString(3) + " " 
                    + resultSet.getString(4) + " " + resultSet.getString(5) + " " + 
                    resultSet.getString(6) + " " + resultSet.getString(7));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase2(String airportName,String arrivalTime){
            try{
                useCase2.setString(1, airportName);
                useCase2.setString(2, arrivalTime);
                ResultSet resultSet = useCase2.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase3(String flightclass,Double lowerbound,Double upperbound){
            try{
                useCase3.setString(1, flightclass);
                if(lowerbound == null){
                    useCase3.setNull(2,Types.DOUBLE);
                }else{
                    useCase3.setDouble(2, lowerbound);
                }
                if(upperbound == null){
                    useCase3.setNull(3,Types.DOUBLE);
                }else{
                    useCase3.setDouble(3, upperbound);
                }
                
                ResultSet resultSet = useCase3.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1) + " " + 
                    resultSet.getString(2) + " " + resultSet.getString(3) + " " 
                    + resultSet.getString(4) + " " + resultSet.getString(5) + " " + 
                    resultSet.getString(6) + " " + resultSet.getString(7) +
                    " " + resultSet.getString(8) + " " 
                    + resultSet.getString(9));
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase4(String email,Double upgradePrice,Integer schedule_id){
            try{
                useCase4.setString(1, email);
                useCase4.setDouble(2, upgradePrice);
                useCase4.setDouble(3, schedule_id);
                useCase4.execute();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase5(){
            try{
                ResultSet resultSet = useCase5.executeQuery();
                while(resultSet.next()){
                    System.out.println(resultSet.getString(1) + " " + 
                    resultSet.getString(2) + " " + resultSet.getString(3) + " " 
                    + resultSet.getString(4) + " " + resultSet.getString(5) + " " + 
                    resultSet.getString(6) + " " + resultSet.getString(7) +
                    " " + resultSet.getString(8) + " " 
                    + resultSet.getString(9));
                 }
                 }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase6(Double expensiveFlightPrice, Integer plane_id ,Integer routeId, String startTime, String endTime, Integer pilotId,String status){
            try{
                useCase6.setDouble(1, expensiveFlightPrice);
                useCase6.setInt(2, plane_id);
                useCase6.setInt(3, routeId);
                useCase6.setString(4, startTime);
                useCase6.setString(5, endTime);
                useCase6.setInt(6, pilotId);
                useCase6.setString(7, status);
                useCase6.execute();
        }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase7(String lowerDate, String upperDate , String startLocation , String endLocation){
            try{
                useCase7.setString(1, lowerDate);
                useCase7.setString(2, upperDate);
                useCase7.setString(3, startLocation);
                useCase7.setString(4, endLocation);
                useCase7.execute();
        }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }

        public static void UseCase8(Integer numberUnsafe, String status){
            try{
                useCase8.setInt(1, numberUnsafe);
                useCase8.setString(2, status);
                useCase8.execute();
        }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
            
        public static void UseCase9(String locA, String locB,String newStatus,String planeModel){
            try{
                useCase9.setString(1, locA);
                useCase9.setString(2, locB);
                useCase9.setString(3, newStatus);
                useCase9.setString(4, planeModel);
                useCase9.execute();
        }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }

        public static void UseCase10(Integer numBookings, Integer percentage){
            try{
                useCase10.setInt(1, numBookings);
                useCase10.setInt(2, percentage);
                useCase10.execute();
        }
                catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println(e.toString());
            }
            
        }
        }

    
    
    