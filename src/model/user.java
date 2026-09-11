/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class user {
     private int id;
    private String txtName;
    private String txtemail;
    private String txtPhoneNumber;
    private String txtaddress;
    private String password;
    private String txtsecuritQuestions;
    private String txtanswer;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtemail() {
        return txtemail;
    }

    public void setTxtemail(String txtemail) {
        this.txtemail = txtemail;
    }

    public String getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    public void setTxtPhoneNumber(String txtPhoneNumber) {
        this.txtPhoneNumber = txtPhoneNumber;
    }

    public String getTxtaddress() {
        return txtaddress;
    }

    public void setTxtaddress(String txtaddress) {
        this.txtaddress = txtaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTxtsecuritQuestions() {
        return txtsecuritQuestions;
    }

    public void setTxtsecuritQuestions(String txtsecuritQuestions) {
        this.txtsecuritQuestions = txtsecuritQuestions;
    }

    public String getTxtanswer() {
        return txtanswer;
    }

    public void setTxtanswer(String txtanswer) {
        this.txtanswer = txtanswer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
