// 
// 
// 

package com.house.entity;

import java.util.Date;

public class House
{
    private int hID;
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
    private String houseDetailsImg;
    private String publisher;
    private Date publishTime;
    
    public int gethID() {
        return this.hID;
    }
    
    public void sethID(final int hID) {
        this.hID = hID;
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
    
    public String gethouseAddress() {
        return this.houseAddress;
    }
    
    public void sethouseAddress(final String houseAddress) {
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
    
    public String getHouseDetailsImg() {
        return this.houseDetailsImg;
    }
    
    public void setHouseDetailsImg(final String houseDetailsImg) {
        this.houseDetailsImg = houseDetailsImg;
    }
    
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }
    
    public Date getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(final Date publishTime) {
        this.publishTime = publishTime;
    }
    
    public House(final String houseDesc, final String houseModel, final String houseArea, final String houseFloor, final String houseType, final int housePrice, final String houseAddress, final String houseImage, final String communityName, final String houseLinkMan, final String houseOriented, final String houseDetailsImg, final String publisher, final Date publishTime) {
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
        this.houseDetailsImg = houseDetailsImg;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }
    
    public House(final int hID, final String houseDesc, final String houseModel, final String houseArea, final String houseFloor, final String houseType, final int housePrice, final String houseAddress, final String houseImage, final String communityName, final String houseLinkMan, final String houseOriented, final String houseDetailsImg, final String publisher, final Date publishTime) {
        this.hID = hID;
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
        this.houseDetailsImg = houseDetailsImg;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }
    
    public House() {
    }
}
