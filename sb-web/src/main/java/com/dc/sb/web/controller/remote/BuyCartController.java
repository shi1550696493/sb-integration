package com.dc.sb.web.controller.remote;

import com.dc.sb.entity.BuyCartGoods;
import com.dc.sb.entity.ResultInfo;
import com.dc.sb.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zj
 * @Date: 2018/10/23 10:19
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/api/buycart")
public class BuyCartController {

    @PostMapping("jiesuan")
    public ResultInfo jiesuan(@RequestBody BuyCartGoods[] buyCartGoodsList) {
        String str = ReflectionToStringBuilder.toString(buyCartGoodsList, ToStringStyle.MULTI_LINE_STYLE);
        log.debug("str========" + str);
        // 生成订单的逻辑
        // .....
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        return resultInfo;
    }

    @GetMapping("list/{userId}")
    public ResultInfo list(@PathVariable String userId) {

        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
//
        List<BuyCartGoods> goodsList = new ArrayList<>();

        BuyCartGoods goods = new BuyCartGoods();
        goods.setChecked(true);
        goods.setImgUrl("https://i1.mifile.cn/a1/pms_1537323963.1278763!220x220.jpg");
        goods.setCountPrice(1399);
        goods.setDesc("小米8 青春版 4GB+64GB 潮流镜面渐变色");
        goods.setId( "1");
        goods.setNum(1 + "");
        goods.setPrice(1399);
        goodsList.add(goods);

        goods = new BuyCartGoods();
        goods.setChecked(true);
        goods.setImgUrl("https://i1.mifile.cn/a1/pms_1537356460.6227958!220x220.png");
        goods.setCountPrice(1399);
        goods.setDesc("小米8 屏幕指纹版 8GB+128GB");
        goods.setId( "1");
        goods.setNum(1 + "");
        goods.setPrice(1399);
        goodsList.add(goods);

        goods = new BuyCartGoods();
        goods.setChecked(true);
        goods.setImgUrl("https://i1.mifile.cn/a1/pms_1527684990.93616987!220x220.jpg");
        goods.setCountPrice(1399);
        goods.setDesc("小米8 SE 4GB+64GB");
        goods.setId( "1");
        goods.setNum(1 + "");
        goods.setPrice(1399);
        goodsList.add(goods);

        resultInfo.setData(goodsList);
        return resultInfo;
    }
}
