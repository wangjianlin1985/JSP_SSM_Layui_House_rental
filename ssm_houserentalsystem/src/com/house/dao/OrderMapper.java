// 
// 
// 

package com.house.dao;

import com.house.entity.UserOrder;
import java.util.List;
import com.house.entity.Page;
import com.house.entity.Order;

public interface OrderMapper
{
    int addOrder(Order p0);
    
    List<UserOrder> findAllOrder(Page p0);
    
    int getOrderCount(int p0);
    
    int deleteOrder(int p0);
}
