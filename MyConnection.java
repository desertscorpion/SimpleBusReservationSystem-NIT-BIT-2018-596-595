
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author qqq
 */
public class MyConnection {
    Connection con;
    public MyConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("searching for connection class");
        }
        catch(ClassNotFoundException cnf){
            System.out.println("class not found and unable to connect........"+ cnf.getLocalizedMessage());
            
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost//busreservation","","");
            
        }
        catch(SQLException e2)
        {
            e2.printStackTrace();
        }
        public Connection getConnection()
        {
            return con;
        }
    }
}
