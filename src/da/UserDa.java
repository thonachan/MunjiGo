/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import javax.swing.JOptionPane;
import model.user;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class UserDa {

    public static void save(user user) {
        String query = "insert into User(name,phoneNumber,email,address,password,securityQuestion,answer,status) values('" + user.getTxtName() + "', '" + user.getTxtPhoneNumber() + "','" + user.getTxtemail() + "','" + user.getTxtaddress() + "','" + user.getPassword() + "','" + user.getTxtsecuritQuestions() + "','" + user.getTxtanswer() + "','false')";
        DbOperations.setDataorDelete(query, "Registered Successfully! Wait For Admin Approval!");

    }

    public static user login(String email, String password) {
        user user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "' and password= '" + password + "'");
            while (rs.next()) {
                user = new user();
                user.setStatus(rs.getString("status"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return user;

    }

    public static user getSecurityQuestion(String email) {
        user user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where email = '" + email + "'");
            while(rs.next()){
            user = new user();
            user.setTxtsecuritQuestions(rs.getString("SecurityQuestion"));
            user.setTxtanswer(rs.getString("answer"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return user;

    }
    
    public static void update(String email, String newPassword){
    String query= "update user set password= '"+newPassword+"' where email= '"+email+"'";
    DbOperations.setDataorDelete(query, "Password Changed Successfully");
    
    
    }
    public static ArrayList<user> getAllRecords(String email){
        ArrayList<user> arrayList =  new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from user where email like '%"+email+"%'");
            while(rs.next()){
            user user = new user();
            user.setId(rs.getInt("id"));
            user.setTxtName(rs.getString("name"));
            user.setTxtemail(rs.getString("email"));
            user.setTxtPhoneNumber(rs.getString("phoneNumber"));
            user.setTxtaddress(rs.getString("address"));
            user.setTxtsecuritQuestions(rs.getString("securityQuestion"));
            user.setStatus(rs.getString("status"));
            arrayList.add(user);
            }
        
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        
        }
        
        return arrayList;
               
    
    }
    
    public static void changeStatus(String email, String status){
    
    String query = "update user set status = '"+status+"' where email = '"+email+"'";
    DbOperations.setDataorDelete(query, "Status Changed Successfully");
    
    
    }
    public static void changePassword(String email, String oldPassword, String newPassword){
    try{
        ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+oldPassword+"'");
        if(rs.next()){
            update(email, newPassword);
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Old Password is Wrong");
        
        }
    
    } 
    catch(Exception e){}
    }
    

}
