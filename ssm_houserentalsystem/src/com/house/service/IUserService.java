// 
// 
// 

package com.house.service;

import com.house.entity.Users;

public interface IUserService
{
    Users login(Users p0);
    
    int regist(Users p0);
    
    int updateUserPwd(Users p0);
    
    Users checkOldPwd(Users p0);
}
