package com.github.betwowt.mmal.dao;

import com.github.betwowt.mmal.pojo.OrderItem;
import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    List<OrderItem> selectAll();

    int updateByPrimaryKey(OrderItem record);
}