package com.dc.sb.web.controller.remote;

import com.dc.sb.entity.Orders;
import com.dc.sb.entity.ResultInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: zj
 * @Date: 2018/10/24 15:47
 * @Description:
 */
@RequestMapping("api/order")
@RestController
public class OrderController {

    @GetMapping("list/{userId}")
    public ResultInfo list(@PathVariable String userId) {

        List<Orders> ordersList = new ArrayList<>();
        Orders orders = new Orders("https://i1.mifile.cn/f/i/g/2015/cn-index/pingmu-320.png"
                , "01201810241601010001", "1", "1", "1399", new Date(),"小米8","小米8 屏幕指纹版");
        ordersList.add(orders);
        orders = new Orders("https://i1.mifile.cn/f/i/g/2015/cn-index/max3-320-220.png"
                , "01201810241601010001", "1", "2", "1399", new Date(),"小米6","小米6 屏幕指纹版");
        ordersList.add(orders);
        orders = new Orders("https://i1.mifile.cn/f/i/g/2015/cn-index/pingmu-320.png"
                , "01201810241605010001", "1", "3", "1899", new Date(),"小米5","小米5 屏幕指纹版");
        ordersList.add(orders);
        orders = new Orders("https://i1.mifile.cn/f/i/g/2015/cn-index/666320.png"
                , "01201810241608010001", "1", "3", "1199", new Date(),"红米","红米8 屏幕指纹版");
        ordersList.add(orders);

        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        resultInfo.setData(ordersList);
        return resultInfo;
    }

}
