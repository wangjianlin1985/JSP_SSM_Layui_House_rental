// 
// 
// 

package com.house.controller;

import com.house.entity.House;
import com.house.entity.Page;
import com.house.entity.UserHouseData;
import com.house.entity.Users;
import java.util.List;
import com.house.entity.UserData;
import org.springframework.web.bind.annotation.ResponseBody;
import com.house.entity.Admin;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.service.IHouserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IAdminService;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController
{
    @Autowired
    private IAdminService service;
    @Autowired
    private IHouserService dao;
    
    @RequestMapping({ "/toadminlogin" })
    public String toAdminLogin() {
        return "admin.jsp";
    }
    
    @RequestMapping({ "/adminAccess" })
    @ResponseBody
    public String adminAccess(final String username, final String userpwd, final HttpServletRequest req) {
        final Admin admin = new Admin(username, userpwd);
        final Admin adminAccess = this.service.adminAccess(admin);
        req.getSession().setAttribute("Admin", (Object)adminAccess);
        if (adminAccess != null) {
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/adminSingnout" })
    public String signout(final HttpServletRequest request) {
        request.getSession().invalidate();
        return "admin.jsp";
    }
    
    @RequestMapping({ "/toAdminHomePage" })
    public String toAdminHomePage() {
        return "adminhome.jsp";
    }
    
    @RequestMapping({ "/toAllUserPage" })
    public String toAllUserPage() {
        return "alluser.jsp";
    }
    
    @RequestMapping({ "/AllUsers" })
    @ResponseBody
    public UserData findAllUser() {
        final List<Users> findAllUser = this.service.findAllUser();
        final UserData u = new UserData();
        u.setCode(0);
        u.setCount(findAllUser.size());
        u.setData(findAllUser);
        u.setMsg("OK");
        return u;
    }
    
    @RequestMapping({ "/toAllHousePage" })
    public String toAllHousePage() {
        return "allhouse.jsp";
    }
    
    @RequestMapping({ "/findAllHouse" })
    @ResponseBody
    public UserHouseData findAllHouse(final int page, final int limit) {
        final Page p = new Page();
        p.setLimit(limit);
        p.setPage((page - 1) * limit);
        final List<House> findAllHouse = this.service.findAllHouse(p);
        final UserHouseData data = new UserHouseData();
        data.setCode(0);
        data.setCount(findAllHouse.size());
        data.setData(findAllHouse);
        data.setMsg("OK");
        return data;
    }
    
    @RequestMapping({ "/deleteHouse" })
    @ResponseBody
    public String deleteHouse(final int hID) {
        final int deleteHouse = this.service.deleteHouse(hID);
        if (deleteHouse > 0) {
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/toAdminUpdateHousePage" })
    public String toUpdatePage(final int hID, final HttpServletRequest request) {
        final House house = this.dao.findHouseDetailsById(hID);
        request.getSession().setAttribute("House", (Object)house);
        return "updatehouse.jsp";
    }
    
    @RequestMapping({ "/toEditUserPage" })
    public String toEditUserPage(final int uID, final HttpServletRequest req) {
        final Users findUserById = this.service.findUserById(uID);
        req.getSession().setAttribute("User", (Object)findUserById);
        return "editUser.jsp";
    }
    
    @RequestMapping({ "/editUser" })
    @ResponseBody
    public String editUser(final Users users) {
        final int n = this.service.updateUser(users);
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/deleteUser" })
    @ResponseBody
    public String deleteUser(final int uID) {
        final int n = this.service.deleteUser(uID);
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/toUpdateAdminPwdPage" })
    public String toUpdateAdminPwdPage() {
        return "updateAdminPwd.jsp";
    }
    
    @RequestMapping({ "/updateAdminPwd" })
    @ResponseBody
    public String updateAdminPwd(final HttpServletRequest request, final String oldpwd, final String newpwd, final String newpwdagain) {
        final Admin admin = new Admin();
        final Admin adminSession = (Admin)request.getSession().getAttribute("Admin");
        admin.setId(adminSession.getId());
        admin.setUserpwd(oldpwd);
        final Admin checkAdminPwd = this.service.checkAdminPwd(admin);
        if (checkAdminPwd == null) {
            return "ERROR";
        }
        if (!newpwd.equals(newpwdagain)) {
            return "FAIL";
        }
        final Admin a = new Admin();
        a.setId(adminSession.getId());
        a.setUserpwd(newpwd);
        final int n = this.service.updateAdminPwd(a);
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
}
