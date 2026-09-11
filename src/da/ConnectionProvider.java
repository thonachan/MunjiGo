/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
           Connection conn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mujigodigital", "root", "");
           return conn;
        
        }catch(Exception e){
        
        return null;
        }
    }
    
}