// 
// 
// 

package com.house.service.impl;

import com.house.entity.Page;
import com.house.entity.House;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.dao.HouseMapper;
import org.springframework.stereotype.Service;
import com.house.service.IHouserService;

@Service
public class HouserServiceImpl implements IHouserService
{
    @Autowired
    private HouseMapper dao;
    
    @Override
    public List<House> findHomeInfo() {
        return this.dao.findHomeInfo();
    }
    
    @Override
    public House findHouseDetailsById(final int id) {
        return this.dao.findHouseDetailsById(id);
    }
    
    @Override
    public int addNewHouse(final House house) {
        return this.dao.addNewHouse(house);
    }
    
    @Override
    public List<House> findHouseByUser(final Page page) {
        return this.dao.findHouseByUser(page);
    }
    
    @Override
    public int deleteUserHouse(final int hID) {
        return this.dao.deleteUserHouse(hID);
    }
    
    @Override
    public int updateHouse(final House house) {
        return this.dao.updateHouse(house);
    }
    
    @Override
    public List<House> findHouseByLike(final String keywords) {
        return this.dao.findHouseByLike(keywords);
    }
    
    @Override
    public List<House> findHouseOrderByAsc() {
        return this.dao.findHouseOrderByAsc();
    }
    
    @Override
    public List<House> findHouseOrderByDesc() {
        return this.dao.findHouseOrderByDesc();
    }
}
