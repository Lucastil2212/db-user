package Driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

//used to handle non-query statements such as update, insert, delete
public class NonQueryStatement implements NonQuery{

    enum NonQueryType {
        BASIC_INSERT, BASIC_DELETE;
    }

    private Connection connection = null;
    private PreparedStatement statement = null;
    private Table table = null;
    private String condition = null;


    public NonQueryStatement(Connection connection, NonQueryType type, Table table){
        this.connection = connection;
        this.table = table;

        if(type == NonQueryType.BASIC_INSERT){
            createInsertStatement();
        }else if(type == NonQueryType.BASIC_DELETE){
            createDeleteStatement();
        }
    }

    

    private void createInsertStatement(){
        StringBuilder sb = new StringBuilder("values(");

        for(int i = 0; i < table.getSize(); i++){
            char prev = sb.toString().charAt(sb.toString().length());

            if(prev == '('){
                sb.append("?");
            }else{
                sb.append(",?");
            }
        }

        sb.append(")");

        try{
            this.statement = connection.prepareStatement("insert into " + this.table.getName() + " " + sb.toString());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void createDeleteStatement(){

    }

    public void execute(){
        try{
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void setString(int index, String s){
        try{
            statement.setString(index, s);
        }catch(SQLException e){
            System.out.println("Unable to set col " + index + "of table " + table.getName() + "to String " + s);
            e.printStackTrace();
        }
    }

    public void setInt(int index, int i){
        try{
            statement.setInt(index, i);
        }catch(SQLException e){
            System.out.println("Unable to set col " + index + "of table " + table.getName() + "to int" + i);
            e.printStackTrace();
        }
    }

}