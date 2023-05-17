// 
// 
// 

package com.house.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.house.entity.House;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IHouserService;
import org.springframework.stereotype.Controller;

@Controller
public class HomePageController
{
    @Autowired
    private IHouserService service;
    
    @RequestMapping({ "/toIndexPage" })
    public String toIndexPage(final HttpServletRequest request) {
        final List<House> findHomeInfo = this.service.findHomeInfo();
        request.getSession().setAttribute("House", (Object)findHomeInfo);
        return "index.jsp";
    }
    
    @RequestMapping({ "/findHouseByLike" })
    public String findHouseByLike(final HttpServletRequest request, final String keywords) {
        final List<House> findHomeInfo = this.service.findHouseByLike(keywords);
        request.getSession().removeAttribute("House");
        request.getSession().setAttribute("House", (Object)findHomeInfo);
        return "index.jsp";
    }
    
    @RequestMapping({ "/findHousrOrderByAsc" })
    public String findHousrOrderByAsc(final HttpServletRequest request) {
        final List<House> findHomeInfo = this.service.findHouseOrderByAsc();
        request.getSession().removeAttribute("House");
        request.getSession().setAttribute("House", (Object)findHomeInfo);
        return "index.jsp";
    }
    
    @RequestMapping({ "/findHousrOrderByDesc" })
    public String findHousrOrderByDesc(final HttpServletRequest request) {
        final List<House> findHomeInfo = this.service.findHouseOrderByDesc();
        request.getSession().removeAttribute("House");
        request.getSession().setAttribute("House", (Object)findHomeInfo);
        return "index.jsp";
    }
}
