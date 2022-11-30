package Driver;
import java.util.Scanner;

public class DeleteCLI {
    public static Scanner scanner = new Scanner(System.in);
    public static void DeleteCLIPassenger(){
            System.out.println("Enter your email then Press enter.");
            String email =  scanner.nextLine();
            DeleteProcedure.removePassenger(email);
        
    }

    public static void DeleteCLILocation(){
            System.out.println("Enter airport then Press enter.");
            String input_airport = scanner.nextLine();
            DeleteProcedure.removeLocation(input_airport);
    }

    public static void DeleteCLIRoute(){
            System.out.println("Enter route id then Press enter.");
            Integer route_id = scanner.nextInt();
            DeleteProcedure.removeRoute(route_id);
    }

    public static void DeleteCLIPilot(){
            System.out.println("Enter pilot id then Press enter. ");
            Integer pilot_id = scanner.nextInt();
            DeleteProcedure.removePilot(pilot_id);
        }
    

    public static void DeleteCLIBooking(){
            System.out.println("Enter booking id as int then Press enter. ");
            Integer booking_id = scanner.nextInt();
            DeleteProcedure.removeBooking(booking_id);
        
    }

    public static void DeleteCLIBookingInfo(){
            System.out.println("Enter schedule id as int then Press enter. ");
            Integer input_sid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter class then Press enter.");
            String input_class = scanner.nextLine();
            DeleteProcedure.removeBookingInfo(input_sid, input_class);
    }

    public static void DeleteCLIStatus(){
            System.out.println("Enter status then Press enter.");
            String input_s = scanner.nextLine();
            DeleteProcedure.removeStatus(input_s);
    }

    public static void DeleteCLIPlane(){
            System.out.println("Enter plane id then Press enter.");
            Integer plane_id = scanner.nextInt();
            DeleteProcedure.removePlane(plane_id);
    }

    public static void DeleteCLISchedule(){
            System.out.println("Enter schedule id as int then Press enter.");
            Integer input_sid = scanner.nextInt();
            DeleteProcedure.removeSchedule(input_sid);
    }
}
