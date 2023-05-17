// 
// 
// 

package com.house.entity;

import java.util.List;

public class UserOrderData
{
    private int code;
    private String msg;
    private int count;
    private List<UserOrder> data;
    
    public int getCode() {
        return this.code;
    }
    
    public void setCode(final int code) {
        this.code = code;
    }
    
    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(final String msg) {
        this.msg = msg;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(final int count) {
        this.count = count;
    }
    
    public List<UserOrder> getData() {
        return this.data;
    }
    
    public void setData(final List<UserOrder> data) {
        this.data = data;
    }
}
