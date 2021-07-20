/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class connect {

   private static Connection Koneksi;
     
    public static Connection GetConnection()throws SQLException{
        if (Koneksi==null){
        try{
              String url = "jdbc:mysql://localhost:3306/db_laundry";
              String user = "root";
              String password = "";
            
              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
              Koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_laundry","root","");
        }catch(SQLException t){
            System.out.println("Error Membuat Koneksi");
        }
        }
        return Koneksi;
    }

}

