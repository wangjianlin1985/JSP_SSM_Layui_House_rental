// 
// 
// 

package com.house.entity;

import java.util.List;

public class UserHouseData
{
    private int code;
    private String msg;
    private int count;
    private List<House> data;
    
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
    
    public List<House> getData() {
        return this.data;
    }
    
    public void setData(final List<House> data) {
        this.data = data;
    }
    
    public UserHouseData(final String msg, final int count, final List<House> data) {
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
    
    public UserHouseData(final int code, final String msg, final int count, final List<House> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
    
    public UserHouseData() {
    }
}
