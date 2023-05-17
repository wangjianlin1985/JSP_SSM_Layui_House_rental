// 
// 
// 

package com.house.entity;

import java.util.Date;

public class UserOrder
{
    private int oID;
    private int hID;
    private Date orderTime;
    private String orderUser;
    private String houseDesc;
    private String houseModel;
    private String houseArea;
    private String houseFloor;
    private String houseType;
    private int housePrice;
    private String houseAddress;
    private String houseImage;
    private String communityName;
    private String houseLinkMan;
    private String houseOriented;
    
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
    
    public String getHouseDesc() {
        return this.houseDesc;
    }
    
    public void setHouseDesc(final String houseDesc) {
        this.houseDesc = houseDesc;
    }
    
    public String getHouseModel() {
        return this.houseModel;
    }
    
    public void setHouseModel(final String houseModel) {
        this.houseModel = houseModel;
    }
    
    public String getHouseArea() {
        return this.houseArea;
    }
    
    public void setHouseArea(final String houseArea) {
        this.houseArea = houseArea;
    }
    
    public String getHouseFloor() {
        return this.houseFloor;
    }
    
    public void setHouseFloor(final String houseFloor) {
        this.houseFloor = houseFloor;
    }
    
    public String getHouseType() {
        return this.houseType;
    }
    
    public void setHouseType(final String houseType) {
        this.houseType = houseType;
    }
    
    public int getHousePrice() {
        return this.housePrice;
    }
    
    public void setHousePrice(final int housePrice) {
        this.housePrice = housePrice;
    }
    
    public String getHouseAddress() {
        return this.houseAddress;
    }
    
    public void setHouseAddress(final String houseAddress) {
        this.houseAddress = houseAddress;
    }
    
    public String getHouseImage() {
        return this.houseImage;
    }
    
    public void setHouseImage(final String houseImage) {
        this.houseImage = houseImage;
    }
    
    public String getCommunityName() {
        return this.communityName;
    }
    
    public void setCommunityName(final String communityName) {
        this.communityName = communityName;
    }
    
    public String getHouseLinkMan() {
        return this.houseLinkMan;
    }
    
    public void setHouseLinkMan(final String houseLinkMan) {
        this.houseLinkMan = houseLinkMan;
    }
    
    public String getHouseOriented() {
        return this.houseOriented;
    }
    
    public void setHouseOriented(final String houseOriented) {
        this.houseOriented = houseOriented;
    }
    
    public UserOrder(final int hID, final Date orderTime, final String orderUser, final String houseDesc, final String houseModel, final String houseArea, final String houseFloor, final String houseType, final int housePrice, final String houseAddress, final String houseImage, final String communityName, final String houseLinkMan, final String houseOriented) {
        this.hID = hID;
        this.orderTime = orderTime;
        this.orderUser = orderUser;
        this.houseDesc = houseDesc;
        this.houseModel = houseModel;
        this.houseArea = houseArea;
        this.houseFloor = houseFloor;
        this.houseType = houseType;
        this.housePrice = housePrice;
        this.houseAddress = houseAddress;
        this.houseImage = houseImage;
        this.communityName = communityName;
        this.houseLinkMan = houseLinkMan;
        this.houseOriented = houseOriented;
    }
    
    public UserOrder(final int oID, final int hID, final Date orderTime, final String orderUser, final String houseDesc, final String houseModel, final String houseArea, final String houseFloor, final String houseType, final int housePrice, final String houseAddress, final String houseImage, final String communityName, final String houseLinkMan, final String houseOriented) {
        this.oID = oID;
        this.hID = hID;
        this.orderTime = orderTime;
        this.orderUser = orderUser;
        this.houseDesc = houseDesc;
        this.houseModel = houseModel;
        this.houseArea = houseArea;
        this.houseFloor = houseFloor;
        this.houseType = houseType;
        this.housePrice = housePrice;
        this.houseAddress = houseAddress;
        this.houseImage = houseImage;
        this.communityName = communityName;
        this.houseLinkMan = houseLinkMan;
        this.houseOriented = houseOriented;
    }
    
    public UserOrder() {
    }
}
