// 
// 
// 

package com.house.controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.entity.Users;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IUserService;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController
{
    @Autowired
    private IUserService mapper;
    
    @RequestMapping({ "/login" })
    @ResponseBody
    public String toCustomerPage(final String username, final String password, final HttpServletRequest req) {
        final Users user = new Users();
        user.setuName(username);
        user.setuPassword(password);
        final Users loginUser = this.mapper.login(user);
        if (loginUser != null) {
            req.getSession().setAttribute("loginUser", (Object)loginUser);
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/signout" })
    public String signout(final HttpSession session) {
        session.invalidate();
        return "redirect:toIndexPage";
    }
    
    @RequestMapping({ "/regist" })
    @ResponseBody
    public String regist(final Users user) {
        try {
            final int regist = this.mapper.regist(user);
            if (regist > 0) {
                return "OK";
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL";
    }
}
