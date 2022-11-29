package Driver;
import java.util.Scanner;

public class InsertCLI {
    public static Scanner scanner = new Scanner(System.in);
    public static void InsertCLIPassenger(){
        System.out.println("Insert into Passenger Y/N?? Press enter to skip");
        String pass_input = scanner.nextLine();
        if (!pass_input.isEmpty()){
            System.out.println("Enter your name then Press enter. ");
            String input_name = scanner.nextLine();
            System.out.println("Enter your email then Press enter.");
            String input_email = scanner.nextLine();
            InsertProcedure.addPassenger(input_name, input_email);
        }
    }

    public static void InsertCLILocation(){
        System.out.println("Insert into Location Y/N?? Press enter to skip");
        String loc_input = scanner.nextLine();
        if (!loc_input.isEmpty()){
            System.out.println("Enter airport then Press enter.");
            String input_airport = scanner.nextLine();
            System.out.println("Enter capacity of airport as int then Press enter.");
            Integer input_cap = scanner.nextInt();
            InsertProcedure.addLocation(input_airport, input_cap);
        }
    }

    public static void InsertCLIRoute(){
        System.out.println("Insert into Route Y/N?? Press enter to skip");
        String route_input = scanner.nextLine();
        if (!route_input.isEmpty()){
            System.out.println("Enter start location then Press enter. ");
            String input_start = scanner.nextLine();
            System.out.println("Enter end location then Press enter.");
            String input_end = scanner.nextLine();
            InsertProcedure.addRoute(input_start, input_end);
        }
    }

    public static void InsertCLIPilot(){
        System.out.println("Insert into Pilot Y/N?? Press enter to skip");
        String pilot_input = scanner.nextLine();
        if (!pilot_input.isEmpty()){
            System.out.println("Enter name then Press enter. ");
            String input_name = scanner.nextLine();
            System.out.println("Enter salary as numeric(6,2) then Press enter.");
            Double input_salary = scanner.nextDouble();
            InsertProcedure.addPilot(input_name, input_salary);
        }
    }

    public static void InsertCLIBooking(){
        System.out.println("Insert into Booking Y/N?? Press enter to skip");
        String booking_input = scanner.nextLine();
        if (!booking_input.isEmpty()){
            System.out.println("Enter schedule id as int then Press enter. ");
            Integer input_sid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter class then Press enter.");
            String input_class = scanner.nextLine();
            System.out.println("Enter your email then Press enter.");
            String input_email = scanner.nextLine();
            System.out.println("Enter your seat number then Press enter.");
            String input_seatnum = scanner.nextLine();
            InsertProcedure.addBooking(input_sid, input_class, input_email, input_seatnum);
        }
    }

    public static void InsertCLIBookingInfo(){
        System.out.println("Insert into Booking Info Y/N?? Press enter to skip");
        String bookinginfo_input = scanner.nextLine();
        if (!bookinginfo_input.isEmpty()){
            System.out.println("Enter schedule id as int then Press enter.");
            Integer input_sid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter class then Press enter.");
            String input_class = scanner.nextLine();
            System.out.println("Enter your price as numeric(6,2) then Press enter.");
            Double input_price = scanner.nextDouble();
            InsertProcedure.addBookingInfo(input_sid, input_class, input_price);
        }
    }

    public static void InsertCLIStatus(){
        System.out.println("Insert into Status Y/N?? Press enter to skip");
        String status_input = scanner.nextLine();
        if (!status_input.isEmpty()){
            System.out.println("Enter status then Press enter. ");
            String input_s = scanner.nextLine();
            System.out.println("Enter status descripton then Press enter.");
            String input_sd = scanner.nextLine();
            InsertProcedure.addStatus(input_s, input_sd);
        }
    }

    public static void InsertCLIPlane(){
        System.out.println("Insert into Plane Y/N?? Press enter to skip");
        String plane_input = scanner.nextLine();
        if (!plane_input.isEmpty()){
            System.out.println("Enter model then Press enter.");
            String input_model = scanner.nextLine();
            System.out.println("Enter manufactuer description then Press enter.");
            String input_manufacturer = scanner.nextLine();
            System.out.println("Enter capacity as integer description then Press enter.");
            Integer input_cap = scanner.nextInt();
            InsertProcedure.addPlane(input_model, input_manufacturer, input_cap);
        }
    }

    public static void InsertCLISchedule(){
        System.out.println("Insert into Schedule Y/N?? Press enter to skip");
        String schedule_input = scanner.nextLine();
        if (!schedule_input.isEmpty()){
            System.out.println("Enter plane id as int then Press enter.");
            Integer input_pid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter route id as int then Press enter.");
            Integer input_rid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter start time as datetime description then Press enter.");
            String input_start = scanner.nextLine();
            System.out.println("Enter end time as datetime description then Press enter.");
            String input_end = scanner.nextLine();
            System.out.println("Enter pilot id as int then Press enter.");
            Integer input_pild = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter status then Press enter. ");
            String input_s = scanner.nextLine();
            InsertProcedure.addSchedule(input_pid, input_rid, input_start,input_end, input_pild, input_s);
        }
    }
}
