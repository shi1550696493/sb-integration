package com.dc.sb.dubbo.provider.mapper;


import com.dc.sb.entity.Shoppingcart;

import java.util.List;

public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);


    List<Shoppingcart> findById(String userid);
}