// 
// 
// 

package com.house.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import com.house.entity.Users;
import com.house.entity.House;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.service.IHouserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IUserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController
{
    @Autowired
    private IUserService service;
    @Autowired
    private IHouserService dao;
    
    @RequestMapping({ "/toUserSystem" })
    public String toUserSystemPage() {
        return "customer.jsp";
    }
    
    @RequestMapping({ "/toUserRentalPage" })
    public String toUserRentalPage() {
        return "myrental.jsp";
    }
    
    @RequestMapping({ "/welcome" })
    public String toWelcomePage() {
        return "welcome.jsp";
    }
    
    @RequestMapping({ "/toUpdateHousePage" })
    public String toUpdatePage(final int hID, final HttpServletRequest request) {
        final House house = this.dao.findHouseDetailsById(hID);
        request.getSession().setAttribute("House", (Object)house);
        return "updatehouse.jsp";
    }
    
    @RequestMapping({ "/updateUserPwd" })
    @ResponseBody
    public String updateUserPwd(final String id, final String newPwd, final String oldPwd) {
        final Users oldUser = new Users();
        oldUser.setuID(Integer.parseInt(id));
        oldUser.setuPassword(oldPwd);
        final Users checkUser = this.service.checkOldPwd(oldUser);
        if (checkUser != null) {
            final Users newUser = new Users();
            newUser.setuID(Integer.parseInt(id));
            newUser.setuPassword(newPwd);
            final int n = this.service.updateUserPwd(newUser);
            if (n > 0) {
                return "OK";
            }
        }
        return "FAIL";
    }
}
