// 
// 
// 

package com.house.service;

import com.house.entity.Page;
import com.house.entity.House;
import java.util.List;

public interface IHouserService
{
    List<House> findHomeInfo();
    
    House findHouseDetailsById(int p0);
    
    int addNewHouse(House p0);
    
    List<House> findHouseByUser(Page p0);
    
    int deleteUserHouse(int p0);
    
    int updateHouse(House p0);
    
    List<House> findHouseByLike(String p0);
    
    List<House> findHouseOrderByDesc();
    
    List<House> findHouseOrderByAsc();
}
