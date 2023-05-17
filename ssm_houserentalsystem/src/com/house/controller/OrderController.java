// 
// 
// 

package com.house.controller;

import com.house.entity.UserOrder;
import java.util.List;
import com.house.entity.Page;
import com.house.entity.UserOrderData;
import org.springframework.web.bind.annotation.ResponseBody;
import com.house.entity.Order;
import com.house.entity.Users;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.service.IOrderService;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController
{
    @Autowired
    private IOrderService sevice;
    
    @RequestMapping({ "/myorder" })
    public String toOrderPage() {
        return "myorder.jsp";
    }
    
    @RequestMapping({ "/updatepwd" })
    public String toUpdatepwdPage() {
        return "updatepwd.jsp";
    }
    
    @RequestMapping({ "/addOrder" })
    @ResponseBody
    public String addOrder(final String id, final HttpServletRequest request) {
        final Users u = (Users)request.getSession().getAttribute("loginUser");
        try {
            final Order order = new Order();
            order.sethID(Integer.parseInt(id));
            order.setOrderUser(u.getuNickName());
            order.setuID(u.getuID());
            final int n = this.sevice.addOrder(order);
            if (n > 0) {
                return "OK";
            }
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return "FAIL";
    }
    
    @RequestMapping({ "/myOrderInfo" })
    @ResponseBody
    public UserOrderData findAllOrder(final int page, final int limit, final HttpServletRequest request) {
        final Page p = new Page();
        p.setPage((page - 1) * limit);
        p.setLimit(limit);
        final Users u = (Users)request.getSession().getAttribute("loginUser");
        p.setuID(u.getuID());
        final UserOrderData uod = new UserOrderData();
        final List<UserOrder> order = this.sevice.findAllOrder(p);
        uod.setCode(0);
        uod.setCount(this.sevice.getOrderCount(u.getuID()));
        uod.setData(order);
        uod.setMsg("200");
        return uod;
    }
    
    @RequestMapping({ "/deleteOrder" })
    @ResponseBody
    public String deleteOrder(final int oID) {
        final int n = this.sevice.deleteOrder(oID);
        if (n > 0) {
            return "OK";
        }
        return "FAIL";
    }
}
