package Driver;
import java.util.Scanner;

import UI.Window;

class App{
    public static Scanner scanner = new Scanner(System.in);
    public static String username = null;
    public static String password = null;

    public static void main(String[] args){
        System.out.println("Enter Username:");
        username = scanner.nextLine();
        System.out.println("Enter Password:");
        password = scanner.nextLine();

        DBConnection connection = DBConnection.getConnection(username, password);

        boolean loop = true;

        while(loop){
            System.out.println("Press 1 to continue using CLI");
            System.out.println("Press 2 to open GUI");

            Integer selection = scanner.nextInt();
            
            if(selection == 1){
                runCli();
                loop = false;
            }else if(selection == 2){
                new Window();
                loop = false;
            }
        }
    }

    public static void runCli(){
        boolean loop = true;
        
        
        while(loop){
            System.out.println("What would you like to do today? Select an integer then press enter.");
            System.out.println(" 1. Insert into Database");
            System.out.println(" 2. Update Database");
            System.out.println(" 3. Delete from Database");
            System.out.println(" 4. Enter the start or end location to find the flights");
            System.out.println(" 5. Check incoming flights are under capacity for your airport");
            System.out.println(" 6. Check for flights within a certain class or price range");
            System.out.println(" 7. Upgrading Passengers based on their amount of bookings");
            System.out.println(" 8. Select all the pilots and their flight schedules regardless if they have a schedule or not");
            System.out.println(" 9. Creating a flight more expensive than all other flights");
            System.out.println(" 10. Delete all flights between two dates and two airport locations");
            System.out.println(" 11. Delete all planes based on their status");
            System.out.println(" 12. Update all the plans from route A to B to an inputted status");
            System.out.println(" 13. Giving Pilots a raise");
            System.out.println(" 14. Logout");
            Integer action = scanner.nextInt();
            if(action == 14){
                loop = false;
            }
            else{
                App.caller(action);
            }
        }
    }

    public static void caller(Integer action){
        Integer actionString = action.intValue();
            if(action == 1){
                App.Inserter();
            }
            else if(action == 2){
                App.Updater();
            }
            else if(action == 3){
                App.Deleter();
            }
           else if(action ==4){
                App.UseCase1CLI();
           }
           else if(action ==5){
            App.UseCase2CLI();
       }
            else if(action ==6){
                App.UseCase3CLI();
        }
           else if(action == 7){
            App.UseCase4CLI();
        }
        else if(action == 8){
            App.UseCase5CLI();
        }
        else if(action == 9){
            App.UseCase6CLI();      
        }
        else if(action == 10){
            App.UseCase7CLI();
        }
        else if(action == 11){
            App.UseCase8CLI();
        }
        else if(action == 12){
            App.UseCase9CLI();
        }
        else if(action == 13){
            App.UseCase10CLI();
        }
    }

    public static void Inserter(){
        Integer action = null;
        System.out.println("1. Insert into Passenger");
        System.out.println("2. Insert into Route");
        System.out.println("3. Insert into Booking");
        System.out.println("4. Insert into Booking Info");
        System.out.println("5. Insert into Location");
        System.out.println("6. Insert into Pilot");
        System.out.println("7. Insert into Status");
        System.out.println("8. Insert into Plane");
        System.out.println("9. Insert into Schedule");
        System.out.println("10. Return to Main Menu");
        action =  scanner.nextInt();

        if(action ==1){
            InsertCLI.InsertCLIPassenger();
            return;
        }
        if(action ==2){
            InsertCLI.InsertCLIRoute();
            return;

        }
        if(action ==3){
            InsertCLI.InsertCLIBooking();
            return;
        }
        if(action ==4){
            InsertCLI.InsertCLIBookingInfo();
            return;

        }
        if(action ==5){
            InsertCLI.InsertCLILocation();
            return;

        }
        if(action ==6){
            InsertCLI.InsertCLIPilot();
            return;

        }
        if(action ==7){
            InsertCLI.InsertCLIStatus();
            return;

        }
        if(action ==8){
            InsertCLI.InsertCLIPlane();
            return;

        }
        if(action ==9){
            InsertCLI.InsertCLISchedule();
            return;

        }
        if(action ==10){
            return;

        }
    }

    public static void Updater(){
        Integer action = null;
        System.out.println("1. Update Passenger");
        System.out.println("2. Update Route");
        System.out.println("3. Update Booking");
        System.out.println("4. Update Booking Info");
        System.out.println("5. Update Location");
        System.out.println("6. Update Pilot");
        System.out.println("7. Update Status");
        System.out.println("8. Update Plane");
        System.out.println("9. Update Schedule");
        System.out.println("10. Return to Main Menu");
        action =  scanner.nextInt();

        if(action ==1){
            UpdateCLI.UpdateCLIPassenger();                  
            return;
        }
        if(action ==2){
            UpdateCLI.UpdateCLIRoute();
            return;

        }
        if(action ==3){
            UpdateCLI.UpdateCLIBooking();
            return;
        }
        if(action ==4){
            UpdateCLI.UpdateCLIBookingInfo();
            return;

        }
        if(action ==5){
            UpdateCLI.UpdateCLILocation();
            return;

        }
        if(action ==6){
            UpdateCLI.UpdateCLIPilot();
            return;

        }
        if(action ==7){
            UpdateCLI.UpdateCLIStatus();
            return;

        }
        if(action ==8){
            UpdateCLI.UpdateCLIPlane();
            return;

        }
        if(action ==9){
            UpdateCLI.UpdatetCLISchedule();
            return;

        }
        if(action ==10){
            return;

        }
    }

    public static void Deleter(){
        Integer action = null;
        System.out.println("1. Delete from Passenger");
        System.out.println("2. Delete from Route");
        System.out.println("3. Delete from Booking");
        System.out.println("4. Delete from Booking Info");
        System.out.println("5. Delete from Location");
        System.out.println("6. Delete from Pilot");
        System.out.println("7. Delete from Status");
        System.out.println("8. Delete from Plane");
        System.out.println("9. Delete from Schedule");
        System.out.println("10. Return to Main Menu");
        action =  scanner.nextInt();

        if(action ==1){
            DeleteCLI.DeleteCLIPassenger();
            return;
        }
        if(action ==2){
            DeleteCLI.DeleteCLIRoute();
            return;

        }
        if(action ==3){
            DeleteCLI.DeleteCLIBooking();
            return;
        }
        if(action ==4){
            DeleteCLI.DeleteCLIBookingInfo();
            return;

        }
        if(action ==5){
            DeleteCLI.DeleteCLILocation();
            return;

        }
        if(action ==6){
            DeleteCLI.DeleteCLIPilot();
            return;

        }
        if(action ==7){
            DeleteCLI.DeleteCLIStatus();
            return;

        }
        if(action ==8){
            DeleteCLI.DeleteCLIPlane();
            return;

        }
        if(action ==9){
            DeleteCLI.DeleteCLISchedule();
            return;

        }
        if(action ==10){
            return;

        }
    }

    public static void UseCase1CLI(){
        String temp = null;
        if(username.equals("airport_admin") || username.equals("gen_user")){
            System.out.println("Enter the start location then press enter.");
            temp = scanner.nextLine();
            String start_loc = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter the end location then press enter.");
            temp = scanner.nextLine();
            String end_loc = (!temp.isEmpty()) ? temp: null;
             UseCases.UseCase1AdminUser(start_loc,end_loc);
    }
        else if(username.equals("pilot")){
            System.out.println("Enter the start location then press enter.");
            temp = scanner.nextLine();
            String start_loc = (!temp.isEmpty()) ? temp: null;
            System.out.println("Enter the end location then press enter.");
            temp = scanner.nextLine();
            String end_loc = (!temp.isEmpty()) ? temp: null;
            Integer pilot_id = scanner.nextInt();
             UseCases.UseCase1Pilot(start_loc,end_loc,pilot_id);
        }
}

    public static void UseCase2CLI(){
            if(!username.equals("airport_admin")){
            //System.out.println("ERORR: THIS USE CASE IS ONLY FOR AIRPORT ADMINISTRATORS");
            //return;
            }else{
            System.out.println("Enter your airport name then press enter.");
            String airport = scanner.nextLine();
            System.out.println("Enter arrival time as datetime then press enter.");
            String arrivalTime = scanner.nextLine();
            UseCases.UseCase2(airport, arrivalTime);
            }
    }

    public static void UseCase3CLI(){
        System.out.println("Enter the class or hit enter to skip: ");
        String temp = scanner.nextLine();
        String flightclass = (!temp.isEmpty()) ? temp: null;
        System.out.println("Enter the maximum price numeric(6,2) or hit enter to skip: ");
        temp = scanner.nextLine();
        Double maxPrice = (temp.isEmpty() ? null : Double.parseDouble(temp));
        System.out.println("Enter the minimum price as numeric(6,2) or hit enter to skip: ");
        temp = scanner.nextLine();
        Double minPrice = (temp.isEmpty() ? null : Double.parseDouble(temp));
        UseCases.UseCase3(flightclass, minPrice, maxPrice);
    }

    public static void UseCase4CLI(){
        System.out.println("Enter email then press enter.");
        String email = scanner.nextLine();
        System.out.println("Enter upgrade price as numeric(6,2) then press enter");
        String value = scanner.nextLine();
        Double upgrade_price = Double.parseDouble(value);
        System.out.println("Enter schedule id as int then press enter");
        value = scanner.nextLine();
        Integer schedule_id = Integer.parseInt(value);
        UseCases.UseCase4(email, upgrade_price, schedule_id); 
    }

    public static void UseCase5CLI(){
        UseCases.UseCase5();
    }

    public static void UseCase6(){
        System.out.println("Enter flight price as numeric(6, 2) then press enter");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter plane id as int then press enter");
        Integer planeID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter route id as int then press enter");
        Integer routeID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter start time as datetime then press enter");
        String startTime = scanner.nextLine();
        System.out.println("Enter end time as datetime then press enter");
        String endTime = scanner.nextLine();
        System.out.println("Enter pilot id as int then press enter");
        Integer pilotID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter flight status then press enter");
        String status = scanner.nextLine();
        UseCases.UseCase6(price, planeID, routeID, startTime, endTime, pilotID, status);
    }

    public static void UseCase7(){
        System.out.println("Enter Start Time as datetime then press enter");
        String startTime = scanner.nextLine();
        System.out.println("Enter End Time as datetime then press enter");
        String endTime = scanner.nextLine();
        System.out.println("Enter Start Location then press enter");
        String startLoc = scanner.nextLine();
        System.out.println("Enter End Location then press enter");
        String endLoc = scanner.nextLine();
        UseCases.UseCase7(startTime, endTime, startLoc, endLoc);
    }

    public static void UseCase8(){
        System.out.println("Enter number unsafe as int then press enter");
        Integer numUnsafe = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter status then press enter");
        String status = scanner.nextLine();
        UseCases.UseCase8(numUnsafe, status);
    }

    public static void UseCase9(){
        System.out.println("Enter location A then press enter");
        String locA = scanner.nextLine();
        System.out.println("Enter location B then press enter");
        String locB = scanner.nextLine();
        System.out.println("Enter new status");
        String status = scanner.nextLine();
        System.out.println("Enter plane model");
        String model = scanner.nextLine();
        UseCases.UseCase9(locA, locB, status, model);
    }

    public static void UseCase10(){
        System.out.println("Enter number of ookings as int then press enter");
        Integer numBookings = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter percentage raise as int then press enter");
        Integer pct = Integer.parseInt(scanner.nextLine());
        UseCases.UseCase10(numBookings,pct);
    }

}