/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import static Main.PopUp.PopUpWin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rnavicka
 */
public class Controller {
    
    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/dbjava?serverTimezone=Etc/GMT-1";
            String username = "root";
            String password = "H0ras123!";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        }catch(ClassNotFoundException | SQLException e){String e1 = e.toString();
                    PopUpWin(e1);}
      
    return null;
}
    
    public static void AddEmployeeQr(String dbs) throws Exception{
        try{
            Connection con = getConnection();
            PreparedStatement push = con.prepareStatement(dbs);
            push.executeUpdate();
        }catch(Exception e){String e1 = e.toString();
                    PopUpWin(e1);}
    }
    
    
     
}
