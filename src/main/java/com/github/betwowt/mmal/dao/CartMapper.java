package com.github.betwowt.mmal.dao;

import com.github.betwowt.mmal.pojo.Cart;
import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    Cart selectByPrimaryKey(Integer id);

    List<Cart> selectAll();

    int updateByPrimaryKey(Cart record);
}