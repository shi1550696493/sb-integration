package com.dc.sb.service;

import com.dc.sb.entity.ResultInfo;

public interface ShoppingCartService {

    public ResultInfo find(String userid);

    ResultInfo del(String id);
}
