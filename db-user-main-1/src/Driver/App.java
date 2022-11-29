package Driver;
import java.util.Scanner;


class App{
    public static Scanner scanner = new Scanner(System.in);
    public static String username = "airport_admin";
    public static String password = null;
    public static void main(String[] args){
        //System.out.println("Enter Username");
        //username = scanner.nextLine();
        //System.out.println("Enter Password");
        //password = scanner.nextLine();
        DBConnection connection = DBConnection.getConnection("airport_admin", "airport_admin");
        boolean loop = true;
        while(loop){
            System.out.println("What would you like to do today?");
            String action = scanner.nextLine();
            if(action.equals("Logout")){
                loop = false;
            }
            else{
                App.caller(action);
            }
        }
    }

    public static void caller(String action){
        String actionString = action;
            if(action.equals("Insert into Database")){
                App.Inserter();
            }
            else if(action.equals("Update Database")){
                App.Updater();
            }
            else if(action.equals("Delete from Database")){
                App.Deleter();
            }
           else if(action.equals("Enter the start or end location to find the flights")){
                App.UseCase1CLI();
           }
           else if(action.equals("Check incoming flights are under capacity for your airport")){
            App.UseCase2CLI();
       }
            else if(action.equals("Check for flights within a certain class or price range")){
                App.UseCase3CLI();
        }
           else if(action.equals("Upgrading Passengers based on their amount of bookings")){
            App.UseCase4CLI();
        }
        else if(action.equals("Select all the pilots and their flight schedules regardless if they have a schedule or not")){
            App.UseCase5CLI();
        }
        else if(action.equals("Creating a flight more expensive than all other flights")){
            App.UseCase6CLI();
        }
        else if(action.equals("Delete all flights between two dates and two airport locations")){
            App.UseCase7CLI();
        }
        else if(action.equals("Delete all planes based on their status")){
            App.UseCase8CLI();
        }
        else if(action.equals("Update all the plans from route A to B to an inputted status")){
            App.UseCase9CLI();
        }
        else if(action.equals("Giving Pilots a raise")){
            App.UseCase10CLI();
        }
    }

    public static void Inserter(){
        InsertCLI.InsertCLIPassenger();
        InsertCLI.InsertCLIRoute();
        InsertCLI.InsertCLIBooking();
        InsertCLI.InsertCLIBookingInfo();
        InsertCLI.InsertCLILocation();
        InsertCLI.InsertCLIPilot();
        InsertCLI.InsertCLIStatus();
        InsertCLI.InsertCLIPlane();
        InsertCLI.InsertCLISchedule();
    }

    public static void Updater(){
        UpdateCLI.UpdateCLIPassenger();
        UpdateCLI.UpdateCLIRoute();
        UpdateCLI.UpdateCLIBooking();
        UpdateCLI.UpdateCLIBookingInfo();
        UpdateCLI.UpdateCLILocation();
        UpdateCLI.UpdateCLIPilot();
        UpdateCLI.UpdateCLIStatus();
        UpdateCLI.UpdateCLIPlane();
        UpdateCLI.UpdatetCLISchedule();
    }

    public static void Deleter(){
        DeleteCLI.DeleteCLIPassenger();
        DeleteCLI.DeleteCLIRoute();
        DeleteCLI.DeleteCLIBooking();
        DeleteCLI.DeleteCLIBookingInfo();
        DeleteCLI.DeleteCLILocation();
        DeleteCLI.DeleteCLIPilot();
        DeleteCLI.DeleteCLIStatus();
        DeleteCLI.DeleteCLIPlane();
        DeleteCLI.DeleteCLISchedule();
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

    public static void UseCase6CLI(){
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

    public static void UseCase7CLI(){
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

    public static void UseCase8CLI(){
        System.out.println("Enter number unsafe as int then press enter");
        Integer numUnsafe = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter status then press enter");
        String status = scanner.nextLine();
        UseCases.UseCase8(numUnsafe, status);
    }

    public static void UseCase9CLI(){
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

    public static void UseCase10CLI(){
        System.out.println("Enter number of ookings as int then press enter");
        Integer numBookings = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter percentage raise as int then press enter");
        Integer pct = Integer.parseInt(scanner.nextLine());
        UseCases.UseCase10(numBookings,pct);
    }

}