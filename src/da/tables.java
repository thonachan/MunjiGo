/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class tables {

    public static void main(String[] args) {
        try {
            String UserTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), phoneNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE (email))";
            String adminDetails = "insert into user(name,phoneNumber, email, address, password, securityQuestion, answer, status) values('Achan', '1234567890', 'achan@gmail.com', 'South', 'Haaland', 'What is your favourite food?', 'pizza', 'true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200), phoneNumber varchar(200), email varchar(10), date varchar(200), total varchar(200), createdBy varchar(200))";
            DbOperations.setDataorDelete(UserTable, "User table created successfully");
            DbOperations.setDataorDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataorDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataorDelete(productTable, "Product Table Created Successfully");
            DbOperations.setDataorDelete(billTable, "Bill Table Created Successfully");
          
          

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
