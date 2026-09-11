/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author hp
 */
public class BillDa {
    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if(rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } 
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill) {
        String query = "insert into bill values('"+bill.getId()+"', '"+bill.getName()+"', '"+bill.getPhoneNumber()+"', '"+bill.getEmail()+"', '"+bill.getDate()+"', '"+bill.getTotal()+"','"+bill.getCreatedBy()+"')";
        DbOperations.setDataorDelete(query, "Bill Details Added Successfully");
    }
    
    public static ArrayList<Bill> getAllRecordsByInc(String date) {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date like '%"+date+"%' order by total ASC"); 
            while(rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setPhoneNumber(rs.getString("phoneNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total")); 
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Bill> getAllRecordsByDesc(String date) {
        ArrayList<Bill> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bill where date like '%"+date+"%' order by total DESC"); 
            while(rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setPhoneNumber(rs.getString("phoneNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total")); 
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    // Remove these duplicate methods as they're now properly implemented above
    /*
    public static ArrayList<Bill> getAllRecordsbyInc(String date) {
        // This is duplicate of getAllRecordsByInc - remove this
    }
    
    public static ArrayList<Bill> getAllRecordsbyDesc(String date) {
        // This is duplicate of getAllRecordsByDesc - remove this
    }
    */
}