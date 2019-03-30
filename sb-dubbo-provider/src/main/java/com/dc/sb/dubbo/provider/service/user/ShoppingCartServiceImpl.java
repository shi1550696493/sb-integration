package com.dc.sb.dubbo.provider.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.dc.sb.dubbo.provider.mapper.ShoppingcartMapper;
import com.dc.sb.entity.ResultInfo;
import com.dc.sb.entity.Shoppingcart;
import com.dc.sb.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = ShoppingCartService.class)
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    @Override
    public ResultInfo find(String userid) {
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        List<Shoppingcart> shoppinglist=shoppingcartMapper.findById(userid);
        resultInfo.setData(shoppinglist);
        return resultInfo;
    }

    @Override
    public ResultInfo del(String id) {
        int t= shoppingcartMapper.deleteByPrimaryKey(Integer.parseInt(id));
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        if (t>0){
            resultInfo=ResultInfo.succcessResultInfo();
            resultInfo.setMsg("删除成功");
        }else {
            resultInfo.setMsg("删除失败");
        }
        return resultInfo;

    }
}
