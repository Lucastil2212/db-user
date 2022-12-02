package UI;

import javax.swing.*;
import javax.swing.border.Border;

import Driver.UseCases;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Window implements ActionListener{
    JFrame f;    
    JMenuBar mb;    
    JMenu insert, update, delete;    
    JMenuItem ipassenger, iroute, ibooking, ibookingInfo, ilocation, ipilot, istatus, iplane, ischedule;
    JMenuItem upassenger, uroute, ubooking, ubookingInfo, ulocation, upilot, ustatus, uplane, uschedule;
    JMenuItem dpassenger, droute, dbooking, dbookingInfo, dlocation, dpilot, dstatus, dplane, dschedule;
    
    JPanel formPanel, capacityP, checkP, updradeP, schedulesP, createP, locationP, statusP, updateStatusP, raiseP, result;
    BoxLayout bLayout;

    JTextArea ta;

    JButton findFlight, capacity, check, upgrade, schedules,  create,  location, status, updateStatus, raise;
    JTextField startLocation, endLocation, airport, arrivalTime, flightClass, max, min, email, price, sched_id, 
        fprice, planeID, routeID, startTime, endTime, pilotID, fstatus, dStartTime, dEndTime, dStartLocation, dEndLocation,
        num, unsafeSatus, locA, locB, uStatus, model, numBookings, perc;

    JPanel mainForm;
    
    public Window(){
        f=new JFrame();   
    
        ipassenger=new JMenuItem("insert into passenger");    
        iroute=new JMenuItem("insert into route");    
        ibooking=new JMenuItem("insert into booking");
        ibookingInfo= new JMenuItem("insert into booking info");
        ilocation = new JMenuItem("insert into location");
        ipilot= new JMenuItem("insert into pilot");
        istatus= new JMenuItem("insert into status");
        iplane = new JMenuItem("insert into plane");
        ischedule = new JMenuItem("insert into schedule");

        upassenger=new JMenuItem("update passenger");    
        uroute=new JMenuItem("update route");    
        ubooking=new JMenuItem("update booking");
        ubookingInfo= new JMenuItem("update booking info");
        ulocation = new JMenuItem("update location");
        upilot= new JMenuItem("update pilot");
        ustatus= new JMenuItem("update status");
        uplane = new JMenuItem("update plane");
        uschedule = new JMenuItem("update schedule");

        dpassenger=new JMenuItem("delete from passenger");    
        droute=new JMenuItem("delete from route");    
        dbooking=new JMenuItem("delete from booking");
        dbookingInfo= new JMenuItem("delete from bookingInfo");
        dlocation = new JMenuItem("delete from location");
        dpilot= new JMenuItem("delete from pilot");
        dstatus= new JMenuItem("delete from status");
        dplane = new JMenuItem("delete from plane");
        dschedule = new JMenuItem("delete from schedule");


        ipassenger.addActionListener(this);    
        iroute.addActionListener(this);    
        ibooking.addActionListener(this);    
        ibookingInfo.addActionListener(this);
        ilocation.addActionListener(this);
        ipilot.addActionListener(this);
        istatus.addActionListener(this);
        iplane.addActionListener(this);
        ischedule.addActionListener(this);
        
        upassenger.addActionListener(this);    
        uroute.addActionListener(this);    
        ubooking.addActionListener(this);    
        ubookingInfo.addActionListener(this);
        ulocation.addActionListener(this);
        upilot.addActionListener(this);
        ustatus.addActionListener(this);
        uplane.addActionListener(this);
        uschedule.addActionListener(this);

        dpassenger.addActionListener(this);    
        droute.addActionListener(this);    
        dbooking.addActionListener(this);    
        dbookingInfo.addActionListener(this);
        dlocation.addActionListener(this);
        dpilot.addActionListener(this);
        dstatus.addActionListener(this);
        dplane.addActionListener(this);
        dschedule.addActionListener(this);
    
        mb=new JMenuBar();    
        insert=new JMenu("Insert");    
        update=new JMenu("Update");    
        delete=new JMenu("Delete");     

        insert.add(ipassenger);
        insert.add(iroute);
        insert.add(ibooking);
        insert.add(ibookingInfo);
        insert.add(ilocation);
        insert.add(ipilot);
        insert.add(istatus);
        insert.add(iplane);
        insert.add(ischedule);

        update.add(upassenger);
        update.add(uroute);
        update.add(ubooking);
        update.add(ubookingInfo);
        update.add(ulocation);
        update.add(upilot);
        update.add(ustatus);
        update.add(uplane);
        update.add(uschedule);

        
        delete.add(dpassenger);
        delete.add(droute);
        delete.add(dbooking);
        delete.add(dbookingInfo);
        delete.add(dlocation);
        delete.add(dpilot);
        delete.add(dstatus);
        delete.add(dplane);
        delete.add(dschedule);
        
    
        formPanel = new JPanel();
        capacityP = new JPanel();
        checkP = new JPanel();
         updradeP = new JPanel();
         schedulesP = new JPanel();
         createP= new JPanel(); 
         locationP= new JPanel();
         statusP = new JPanel();
        updateStatusP = new JPanel(); 
        raiseP = new JPanel();

        ta = new JTextArea("RESULTS OF QUERY");
        ta.setSize(100, 50);
        mainForm = new JPanel();

        result = new JPanel();
        result.add(ta);
       
        //     System.out.println(" 4. Enter the start or end location to find the flights");
            startLocation = new JTextField("Enter Start Location"); 
            endLocation = new JTextField("Enter End Location");

                //     System.out.println(" 5. Check incoming flights are under capacity for your airport");
            capacity = new JButton("Check Capacity");
            arrivalTime = new JTextField("Enter arrival time as datetime");
            airport = new JTextField("Enter name of airport");

            capacity.addActionListener(this);

            capacityP.add(airport);
            capacityP.add(arrivalTime);
            capacityP.add(capacity);

        //     System.out.println(" 6. Check for flights within a certain class or price range");

        flightClass = new JTextField("Enter the class");
        max = new JTextField("Enter max price as numeric(6,2)");
        min = new JTextField("Enter min price as numeric(6,2)");

        check = new JButton("Find Flights");

        check.addActionListener(this);

        checkP.add(flightClass);
        checkP.add(max);
        checkP.add(min);
        checkP.add(check);


        email = new JTextField("Enter email");
        price = new JTextField("Enter upgrade price as numeric(6,2)");
        sched_id = new JTextField("Enter schedule id");

        upgrade = new JButton("Upgrade");

        upgrade.addActionListener(this);
        updradeP.add(email);
        updradeP.add(price);
        updradeP.add(sched_id);
        updradeP.add(upgrade);

        //     System.out.println(" 8. Select all the pilots and their flight schedules regardless if they have a schedule or not");
        schedules = new JButton("Get all pilots and their flight schedules");
        schedulesP.add(schedules);
        schedules.addActionListener(this);
        //     System.out.println(" 9. Creating a flight more expensive than all other flights");

        fprice = new JTextField("Enter flight price as numeric(6, 2)");
        planeID = new JTextField("Enter plane id");
        routeID = new JTextField("Enter route id"); 
        startTime = new JTextField("Enter start id as date time");
        endTime = new JTextField("Enter end time as a dateime");
        pilotID= new JTextField("Enter pilot id");
        fstatus = new JTextField("Enter flight status");

        create = new JButton("Create expensive flight");

        create.addActionListener(this);
        createP.add(fprice);
        createP.add(planeID);
        createP.add(routeID);
        createP.add(startTime);
        createP.add(endTime);
        createP.add(pilotID);
        createP.add(fstatus);
        createP.add(create);

        //     System.out.println(" 10. Delete all flights between two dates and two airport locations");
        dStartTime = new JTextField("Enter start time as datetime");
        dEndTime = new JTextField("Enter end time as datetime");

        dStartLocation = new JTextField("Enter start location");
        dEndLocation = new JTextField("Enter end location");

        location = new JButton("Delete flight between dates and airports");

        location.addActionListener(this);
        locationP.add(dStartTime);
        locationP.add(dEndTime);
        locationP.add(dStartLocation);
        locationP.add(dEndLocation);

        locationP.add(location);

        num = new JTextField("Enter unsafe number as int");
        unsafeSatus = new JTextField("Enter status");
        status = new JButton("Delete planes by status");

        status.addActionListener(this);

        statusP.add(num);
        statusP.add(unsafeSatus);
        statusP.add(status);

        locA = new JTextField("Enter location A");
        locB = new JTextField("Enter location B");
        uStatus = new JTextField("Enter new status");
        model = new JTextField("Enter plane model");

        updateStatus = new JButton("Update status of all the planes from route A to B");

        updateStatus.addActionListener(this);
        updateStatusP.add(locA);
        updateStatusP.add(locB);
        updateStatusP.add(uStatus);
        updateStatusP.add(model);
        updateStatusP.add(updateStatus);



        findFlight= new JButton("Find Flight");



            formPanel.add(startLocation);
            formPanel.add(endLocation);
            formPanel.add(findFlight);

            findFlight.addActionListener(this);


        raise = new JButton("Give pilots a raise");
        numBookings = new JTextField("Enter number of bookings as int");

        perc = new JTextField("Enter percent to raise as int");

        raise.addActionListener(this);
        raiseP.add(numBookings);
        raiseP.add(perc);
        raiseP.add(raise);

        Border b = BorderFactory.createLineBorder(Color.black);

        formPanel.setBorder(b);
        capacityP.setBorder(b);
        checkP.setBorder(b);
        updradeP.setBorder(b);
        schedulesP.setBorder(b);
        createP.setBorder(b);
        locationP.setBorder(b); 
        statusP.setBorder(b);
        updateStatusP.setBorder(b);
        raiseP.setBorder(b);

       mainForm.add(formPanel);
       mainForm.add(capacityP);
       mainForm.add(checkP);
       mainForm.add(updradeP);
       mainForm.add(schedulesP);
       mainForm.add(createP);
       mainForm.add(locationP);
       mainForm.add(statusP);
       mainForm.add(updateStatusP);
       mainForm.add(raiseP);
       
        result.setPreferredSize(new Dimension(800, 200));
        mainForm.add(result);

        GridLayout grid = new GridLayout(6,2);

        mainForm.setLayout(new GridLayout(6, 2));

        mb.add(insert);
        mb.add(update);
        mb.add(delete);
        f.add(mb);f.add(mainForm);
        f.setJMenuBar(mb);      
        f.setSize(1200,500);    
        f.setVisible(true);    
        }     


    public void actionPerformed(ActionEvent e) {    
        if(e.getSource() == findFlight) {
            UseCase1();
            return;
        }
        if(e.getSource() == capacity) {
            UseCase2();
            return;
        }
        if(e.getSource() == check){
            UseCase3();
            return;
        }
        if(e.getSource() == upgrade) {
            UseCase4();
            return;
        };
        if(e.getSource() == schedules){ 
            UseCase5();
            return;
        };
        if(e.getSource() == create) {
            UseCase6();
            return;
        };
        if(e.getSource() == location){
            UseCase7();
         return;
        }
        if(e.getSource() == status) {
            UseCase8();   
            return;
        }
        if(e.getSource() == updateStatus){
            UseCase9();
            return;
        }
        if(e.getSource() == raise) {
            UseCase10();
            return;
        };
        if(e.getSource()== ipassenger)  return;
        if(e.getSource() == iroute) return;
        if(e.getSource() == ibooking) return;
        if(e.getSource() == ibookingInfo) return;
        if(e.getSource() == ilocation) return;
        if(e.getSource() == ipilot) return;
        if(e.getSource() == istatus) return;
        if(e.getSource() == iplane) return;
        if(e.getSource() == ischedule) return;

        if(e.getSource()== upassenger)  return;
        if(e.getSource() == uroute) return;
        if(e.getSource() == ubooking) return;
        if(e.getSource() == ubookingInfo) return;
        if(e.getSource() == ulocation) return;
        if(e.getSource() == upilot) return;
        if(e.getSource() == ustatus) return;
        if(e.getSource() == uplane) return;
        if(e.getSource() == uschedule) return;

        if(e.getSource()== dpassenger)  return;
        if(e.getSource() == droute) return;
        if(e.getSource() == dbooking) return;
        if(e.getSource() == dbookingInfo) return;
        if(e.getSource() == dlocation) return;
        if(e.getSource() == dpilot) return;
        if(e.getSource() == dstatus) return;
        if(e.getSource() == dplane) return;
        if(e.getSource() == dschedule) return;
    }



    public void UseCase1(){
        String start_loc = startLocation.getText();
        String end_loc = endLocation.getText();
        UseCases.UseCase1AdminUser(start_loc,end_loc);

    }

    public void UseCase2(){
        String air = airport.getText();
        String time = arrivalTime.getText();

        UseCases.UseCase2(air, time);
        
    }

    public void UseCase3(){
        String fClass = flightClass.getText();

        Integer minPrice = Integer.parseInt(min.getText());
        Integer maxPrice = Integer.parseInt(max.getText());

        UseCases.UseCase3(fClass, (double) minPrice, (double) maxPrice);
    }

    public void UseCase4(){

        String mail = email.getText();
        Integer upgrade_price = Integer.parseInt(price.getText());
        Integer schedule_id = Integer.parseInt(sched_id.getText());

        UseCases.UseCase4(mail, (double) upgrade_price, schedule_id); 
    }

    public static void UseCase5(){
        UseCases.UseCase5();
    }

    public void UseCase6(){
        Integer fliPrice = Integer.parseInt(fprice.getText());
        Integer planeId = Integer.parseInt(planeID.getText());
        Integer routeId = Integer.parseInt(routeID.getText());
        String sTime = startTime.getText();
        String eTime = endTime.getText();
        Integer pilotId  = Integer.parseInt(pilotID.getText()); 
        String fliStatus = fstatus.getText();

        UseCases.UseCase6((double) fliPrice, planeId, routeId, sTime, eTime, pilotId, fliStatus);
    }

    public void UseCase7(){
        String sTime = dStartTime.getText();
        String eTime = dEndTime.getText();
        String sLoc = dStartLocation.getText();
        String eLoc = dEndLocation.getText();

        UseCases.UseCase7(sTime, eTime, sLoc, eLoc);
    }

    public void UseCase8(){
        Integer numUnSafe = Integer.parseInt(num.getText());
        String unSafeStatus = unsafeSatus.getText();        
        
        UseCases.UseCase8(numUnSafe, unSafeStatus);
    }

    public void UseCase9(){
        String locationA = locA.getText();
        String locationB = locB.getText();

        String updateStatus = uStatus.getText();
        String updateModel = model.getText();


        UseCases.UseCase9(locationA, locationB, updateStatus, updateModel);
    }

    public void UseCase10(){
        Integer numberBookings = Integer.parseInt(numBookings.getText());
        Integer percentage = Integer.parseInt(perc.getText());

        UseCases.UseCase10(numberBookings, percentage);
    }
   
}


