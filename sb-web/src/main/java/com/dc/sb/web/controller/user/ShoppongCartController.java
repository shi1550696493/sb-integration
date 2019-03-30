package com.dc.sb.web.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.ResultInfo;
import com.dc.sb.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user/shoppingcart")
@RestController
public class ShoppongCartController {

    @Reference(version = "1.0.0")
    private ShoppingCartService shoppingCartService;
    @GetMapping()
    public ResultInfo find(){
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        String userid="1";
        resultInfo = shoppingCartService.find(userid);
        return resultInfo;
    }
    @DeleteMapping("{id}")
    public ResultInfo del(@PathVariable String id){
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        resultInfo=shoppingCartService.del(id);
        return  resultInfo;
    }
}
