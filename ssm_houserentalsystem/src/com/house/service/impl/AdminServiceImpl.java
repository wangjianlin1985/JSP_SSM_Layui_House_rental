// 
// 
// 

package com.house.service.impl;

import com.house.entity.House;
import com.house.entity.Page;
import com.house.entity.Users;
import java.util.List;
import com.house.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.dao.AdminMapper;
import org.springframework.stereotype.Service;
import com.house.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService
{
    @Autowired
    private AdminMapper service;
    
    @Override
    public Admin adminAccess(final Admin admin) {
        return this.service.adminAccess(admin);
    }
    
    @Override
    public List<Users> findAllUser() {
        return this.service.findAllUser();
    }
    
    @Override
    public List<House> findAllHouse(final Page page) {
        return this.service.findAllHouse(page);
    }
    
    @Override
    public int deleteHouse(final int hID) {
        return this.service.deleteHouse(hID);
    }
    
    @Override
    public Users findUserById(final int uID) {
        return this.service.findUserById(uID);
    }
    
    @Override
    public int updateUser(final Users users) {
        return this.service.updateUser(users);
    }
    
    @Override
    public int deleteUser(final int uID) {
        return this.service.deleteUser(uID);
    }
    
    @Override
    public Admin checkAdminPwd(final Admin admin) {
        return this.service.checkAdminPwd(admin);
    }
    
    @Override
    public int updateAdminPwd(final Admin admin) {
        return this.service.updateAdminPwd(admin);
    }
}
