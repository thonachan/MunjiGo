/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;


/**
 *
 * @author hp
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("C:\\Users\\hp\\Downloads\\MUNJIGODIGITAL\\orders\\bill id" +id+ ".pdf")).exists()){
                Process P = Runtime
                        .getRuntime()
                        .exec("rund1132 url.dll, FileProtocolHandler E:\\\\\"+id+\".pdf");
               
            }
            else 
                JOptionPane.showMessageDialog(null, "File is not Exists");
        
        
        
        
        }
        catch(Exception e){
        
        
        }
    
    
    }
    
}
