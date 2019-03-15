package com.dc.sb.service;

import com.dc.sb.entity.User;

public interface User2Service {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    void addUser(User user);

}
