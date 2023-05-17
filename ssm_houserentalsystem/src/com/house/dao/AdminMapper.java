// 
// 
// 

package com.house.dao;

import com.house.entity.House;
import com.house.entity.Page;
import com.house.entity.Users;
import java.util.List;
import com.house.entity.Admin;

public interface AdminMapper
{
    Admin adminAccess(Admin p0);
    
    List<Users> findAllUser();
    
    List<House> findAllHouse(Page p0);
    
    int deleteHouse(int p0);
    
    Users findUserById(int p0);
    
    int updateUser(Users p0);
    
    int deleteUser(int p0);
    
    Admin checkAdminPwd(Admin p0);
    
    int updateAdminPwd(Admin p0);
}
