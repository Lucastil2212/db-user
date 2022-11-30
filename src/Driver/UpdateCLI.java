package Driver;

import java.util.Scanner;


public class UpdateCLI {
    public static Scanner scanner = new Scanner(System.in);
    public static void UpdateCLIPassenger(){
            System.out.println("Enter your email to update then press enter");
            String input_email = scanner.nextLine();
            System.out.println("Enter your new email to update then press enter or press enter to skip update of this field.");
            String temp = scanner.nextLine();
            String input_newemail = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter your new name then press enter. or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_name = (!temp.isEmpty()) ? temp: null;
            UpdateProcedure.updatePassenger(input_email,input_newemail,input_name);
    }

    public static void UpdateCLILocation(){
            System.out.println("Enter airport then Press enter");
            String input_airport = scanner.nextLine();
            System.out.println("Enter your new airport name to update then press enter or press enter to skip update of this field.");
            String temp = scanner.nextLine();
            String input_newan = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter capacity of airport as int then Press enter. or press enter to skip the update of this field.");
            Integer tempInt = (scanner.hasNextInt()) ? scanner.nextInt() : null;
            Integer input_cap = tempInt;
            UpdateProcedure.updateLocation(input_airport,input_newan, input_cap);;
    }

    public static void UpdateCLIRoute(){
            System.out.println("Enter route id location then Press enter");
            Integer routeId = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter start location then Press enter. or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_start = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter end location then Press enter. or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_end = (!temp.isEmpty()) ? temp: null;
            UpdateProcedure.updateRoute(routeId, input_start, input_end);
    }

    public static void UpdateCLIPilot(){
            System.out.println("Enter pilot id location then Press enter");
            Integer pilotId = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter name then Press enter. or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_name = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter salary as numeric(6,2) then Press enter. or press enter to skip the update of this field.");
            Double tempDouble = (scanner.hasNextDouble()) ? scanner.nextDouble() : null;
            Double salary = tempDouble;
            UpdateProcedure.updatePilot(pilotId, input_name, salary);
    }

    public static void UpdateCLIBooking(){ 
            System.out.println("Enter booking id as int then Press enter.");
            Integer booking_id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter schedule id as int then Press enter.or press enter to skip the update of this field.");
            String tempint = scanner.nextLine();
            Integer input_sid = (!tempint.isEmpty()) ? Integer.parseInt(tempint) : null;
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter class then Press enter.or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_class = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter your email then Press enter.or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_email = scanner.nextLine();
            System.out.println("Enter your seat number then Press enter.or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_seatnum = (!temp.isEmpty()) ? temp: null;
            UpdateProcedure.updateBooking(booking_id, input_sid, input_class, input_email, input_seatnum);;
    }

    public static void UpdateCLIBookingInfo(){
            System.out.println("Enter schedule id as int then Press enter. ");
            Integer input_sid = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter class then Press enter.");
            String input_class = scanner.nextLine();
            System.out.println("Enter your price as numeric(6,2) then Press enter.or press enter to skip the update of this field.");
            Double tempDouble = (scanner.hasNextDouble()) ? scanner.nextDouble() : null;
            Double price = tempDouble;
            UpdateProcedure.updateBookingInfo(input_sid, input_class, price);
        }
    

    public static void UpdateCLIStatus(){
            System.out.println("Enter status then Press enter.");
            String input_s = scanner.nextLine();
            System.out.println("Enter new status then Press enter.or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_new_status = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter status descripton then Press enter. or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_sd = (!temp.isEmpty()) ? temp: null;
            UpdateProcedure.updateStatus(input_s, input_new_status, input_sd);
        }
    

    public static void UpdateCLIPlane(){
            System.out.println("Enter the plane id then press enter.");
            Integer input_plane_id = scanner.nextInt();
            scanner.nextLine(); //To take out the enter line
            System.out.println("Enter model then Press enter.or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_model = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter manufactuer description then Press enter.or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_manufacturer = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter capacity as integer description then Press enter.or press enter to skip the update of this field.");
            Integer tempInt = (scanner.hasNextInt()) ? scanner.nextInt() : null;
            Integer input_cap= tempInt;
            UpdateProcedure.updatePlane(input_plane_id, input_model, input_manufacturer, input_cap);
        
    }

    public static void UpdatetCLISchedule(){
            System.out.println("Enter schedule id as int then Press enter.");
            Integer input_sid = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter plane id as int then Press enter.or press enter to skip the update of this field.");
            String tempInt = scanner.nextLine(); 
            Integer input_pid =(!tempInt.isEmpty()) ? Integer.parseInt(tempInt): null;
            System.out.println("Enter route id as int then Press enter .or press enter to skip the update of this field.");
            tempInt = scanner.nextLine(); 
            Integer input_rid = (!tempInt.isEmpty()) ? Integer.parseInt(tempInt): null;
            System.out.println("Enter start time as datetime description then Press enter.or press enter to skip the update of this field.");
            String temp = scanner.nextLine();
            String input_start = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter end time as datetime description then Press enter.or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_end = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter pilot id as int then Press enter.or press enter to skip the update of this field.");
            tempInt = scanner.nextLine();
            Integer input_pild = (!tempInt.isEmpty()) ? Integer.parseInt(tempInt): null;
            System.out.println("Enter status then Press enter.or press enter to skip the update of this field.");
            temp = scanner.nextLine();
            String input_s =(!temp.isEmpty()) ? temp: null;;
            UpdateProcedure.updateSchedule(input_sid, input_pid, input_rid, input_start, input_end, input_pild, input_s);
    }
}
