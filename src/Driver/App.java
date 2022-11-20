package Driver;

import java.util.function.DoubleBinaryOperator;

import UI.Window;

class App{
    public static void main(String[] args){

        DBConnection connection = DBConnection.getConnection("dbuser", "password");

        InsertProcedure.addPassenger("rupika", "rupika@gmail.com");

    }
}

//Stored Proccure, Triggers, Commit/Rollback