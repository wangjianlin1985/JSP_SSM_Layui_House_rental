// 
// 
// 

package com.house.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.house.entity.House;
import java.util.List;
import com.house.entity.Users;
import com.house.entity.Page;
import com.house.entity.UserHouseData;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IHouserService;
import org.springframework.stereotype.Controller;

@Controller
public class HouseController
{
    @Autowired
    private IHouserService service;
    
    @RequestMapping({ "/findUserHouse" })
    @ResponseBody
    public UserHouseData houseByUser(final HttpServletRequest request, final int page, final int limit) {
        final Page p = new Page();
        final Users u = (Users)request.getSession().getAttribute("loginUser");
        final String publisher = u.getuNickName();
        p.setPublisher(publisher);
        p.setLimit(limit);
        p.setPage((page - 1) * limit);
        final List<House> list = this.service.findHouseByUser(p);
        System.out.println(list);
        final UserHouseData data = new UserHouseData(0, "200", list.size(), list);
        return data;
    }
    
    @RequestMapping({ "/deleteUserHouse" })
    @ResponseBody
    public String deleteUserHouse(final String hID) {
        final int n = this.service.deleteUserHouse(Integer.parseInt(hID));
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/updateHouse" })
    @ResponseBody
    public String updateHouse(final House house) {
        final int n = this.service.updateHouse(house);
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
}
