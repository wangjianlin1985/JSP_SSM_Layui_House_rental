// 
// 
// 

package com.house.entity;

public class Page
{
    private int page;
    private int limit;
    private int uID;
    private String publisher;
    
    public int getPage() {
        return this.page;
    }
    
    public void setPage(final int page) {
        this.page = page;
    }
    
    public int getLimit() {
        return this.limit;
    }
    
    public void setLimit(final int limit) {
        this.limit = limit;
    }
    
    public int getuID() {
        return this.uID;
    }
    
    public void setuID(final int uID) {
        this.uID = uID;
    }
    
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }
    
    public Page(final int page, final int limit, final int uID, final String publisher) {
        this.page = page;
        this.limit = limit;
        this.uID = uID;
        this.publisher = publisher;
    }
    
    public Page(final int limit, final int uID, final String publisher) {
        this.limit = limit;
        this.uID = uID;
        this.publisher = publisher;
    }
    
    public Page() {
    }
}
