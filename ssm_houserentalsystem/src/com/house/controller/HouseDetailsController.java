// 
// 
// 

package com.house.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.house.entity.House;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IHouserService;
import org.springframework.stereotype.Controller;

@Controller
public class HouseDetailsController
{
    @Autowired
    private IHouserService service;
    
    @RequestMapping({ "/toDetailsPage" })
    public String toDetailsPage(final int id, final HttpServletRequest request) {
        final House HouseDetails = this.service.findHouseDetailsById(id);
        final List<String> list = new ArrayList<String>();
        final String[] split = HouseDetails.getHouseDetailsImg().split("~");
        for (int i = 0; i < split.length; ++i) {
            list.add(split[i]);
        }
        request.getSession().setAttribute("Details", (Object)HouseDetails);
        request.getSession().setAttribute("DetailsImg", (Object)list);
        return "housedetails.jsp";
    }
}
