package com.github.betwowt.mmal.dao;

import com.github.betwowt.mmal.pojo.Product;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    Product selectByPrimaryKey(Integer id);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}