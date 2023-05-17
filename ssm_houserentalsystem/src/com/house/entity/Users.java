// 
// 
// 

package com.house.entity;

public class Users
{
    private int uID;
    private String uName;
    private String uPassword;
    private String uPhoneNumber;
    private String uNickName;
    
    public int getuID() {
        return this.uID;
    }
    
    public void setuID(final int uID) {
        this.uID = uID;
    }
    
    public String getuName() {
        return this.uName;
    }
    
    public void setuName(final String uName) {
        this.uName = uName;
    }
    
    public String getuPassword() {
        return this.uPassword;
    }
    
    public void setuPassword(final String uPassword) {
        this.uPassword = uPassword;
    }
    
    public String getuPhoneNumber() {
        return this.uPhoneNumber;
    }
    
    public void setuPhoneNumber(final String uPhoneNumber) {
        this.uPhoneNumber = uPhoneNumber;
    }
    
    public String getuNickName() {
        return this.uNickName;
    }
    
    public void setuNickName(final String uNickName) {
        this.uNickName = uNickName;
    }
    
    public Users(final int uID, final String uName, final String uPassword, final String uPhoneNumber, final String uNickName) {
        this.uID = uID;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uPhoneNumber = uPhoneNumber;
        this.uNickName = uNickName;
    }
    
    public Users() {
    }
    
    public Users(final String uName, final String uPassword, final String uPhoneNumber, final String uNickName) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uPhoneNumber = uPhoneNumber;
        this.uNickName = uNickName;
    }
}
