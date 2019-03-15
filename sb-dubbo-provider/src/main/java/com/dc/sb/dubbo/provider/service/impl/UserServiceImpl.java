package com.dc.sb.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dc.sb.dubbo.provider.mapper.UserMapper;
import com.dc.sb.entity.User;
import com.dc.sb.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = User2Service.class)
public class UserServiceImpl implements User2Service{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public void addUser(User user) {
       userMapper.insertSelective(user);
    }
}
