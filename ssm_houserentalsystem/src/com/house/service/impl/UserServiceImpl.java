// 
// 
// 

package com.house.service.impl;

import com.house.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.dao.UserMapper;
import org.springframework.stereotype.Service;
import com.house.service.IUserService;

@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper mapper;
    
    @Override
    public Users login(final Users user) {
        return this.mapper.login(user);
    }
    
    @Override
    public int regist(final Users user) {
        return this.mapper.regist(user);
    }
    
    @Override
    public int updateUserPwd(final Users users) {
        return this.mapper.updateUserPwd(users);
    }
    
    @Override
    public Users checkOldPwd(final Users users) {
        return this.mapper.checkOldPwd(users);
    }
}
