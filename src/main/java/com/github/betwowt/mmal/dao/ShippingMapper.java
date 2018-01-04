package com.github.betwowt.mmal.dao;

import com.github.betwowt.mmal.pojo.Shipping;
import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    List<Shipping> selectAll();

    int updateByPrimaryKey(Shipping record);
}