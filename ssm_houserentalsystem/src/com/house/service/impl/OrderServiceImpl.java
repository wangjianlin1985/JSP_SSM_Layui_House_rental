// 
// 
// 

package com.house.service.impl;

import com.house.entity.UserOrder;
import java.util.List;
import com.house.entity.Page;
import com.house.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import com.house.dao.OrderMapper;
import org.springframework.stereotype.Service;
import com.house.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService
{
    @Autowired
    private OrderMapper mapper;
    
    @Override
    public int addOrder(final Order order) {
        return this.mapper.addOrder(order);
    }
    
    @Override
    public List<UserOrder> findAllOrder(final Page page) {
        return this.mapper.findAllOrder(page);
    }
    
    @Override
    public int getOrderCount(final int uID) {
        return this.mapper.getOrderCount(uID);
    }
    
    @Override
    public int deleteOrder(final int oID) {
        return this.mapper.deleteOrder(oID);
    }
}
