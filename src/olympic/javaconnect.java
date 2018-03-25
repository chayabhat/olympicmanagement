/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olympic;

/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn;
    public static Connection ConnectDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:G:\\netbeans projects\\project\\OlympicNew.sqlite");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
