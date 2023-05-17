// 
// 
// 

package com.house.entity;

public class Admin
{
    private int id;
    private String username;
    private String userpwd;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public String getUserpwd() {
        return this.userpwd;
    }
    
    public void setUserpwd(final String userpwd) {
        this.userpwd = userpwd;
    }
    
    public Admin(final int id, final String username, final String userpwd) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
    }
    
    public Admin(final String username, final String userpwd) {
        this.username = username;
        this.userpwd = userpwd;
    }
    
    public Admin() {
    }
}
