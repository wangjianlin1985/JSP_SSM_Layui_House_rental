// 
// 
// 

package com.house.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class Order
{
    private int oID;
    private int hID;
    private int uID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;
    private String orderUser;
    
    public int getuID() {
        return this.uID;
    }
    
    public void setuID(final int uID) {
        this.uID = uID;
    }
    
    public int getoID() {
        return this.oID;
    }
    
    public void setoID(final int oID) {
        this.oID = oID;
    }
    
    public int gethID() {
        return this.hID;
    }
    
    public void sethID(final int hID) {
        this.hID = hID;
    }
    
    public Date getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(final Date orderTime) {
        this.orderTime = orderTime;
    }
    
    public String getOrderUser() {
        return this.orderUser;
    }
    
    public void setOrderUser(final String orderUser) {
        this.orderUser = orderUser;
    }
    
    public Order(final int hID, final int uID, final Date orderTime, final String orderUser) {
        this.hID = hID;
        this.uID = uID;
        this.orderTime = orderTime;
        this.orderUser = orderUser;
    }
    
    public Order(final int oID, final int hID, final int uID, final Date orderTime, final String orderUser) {
        this.oID = oID;
        this.hID = hID;
        this.uID = uID;
        this.orderTime = orderTime;
        this.orderUser = orderUser;
    }
    
    public Order() {
    }
}
