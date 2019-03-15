package com.dc.sb.web.controller.remote;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.PinPai;
import com.dc.sb.service.PinPaiService;
import com.dc.sb.service.RemoteUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * dubbo消费者controller
 * @author DUCHONG
 * @since 2018-07-03 18:44
 **/

@RestController
public class RemoteUserController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "1.0.0")
    private RemoteUserService remoteUserService;

    @Reference(version = "1.0.0")
    private PinPaiService pinPaiService;

    @RequestMapping(value="/dubbo/say/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name){

        String result=remoteUserService.sayHello(name);
        return result;
    }

    @GetMapping("/dubbo/findPinPai")
    public List<PinPai> findPinPai() {
        List<PinPai> pinPais = pinPaiService.findPinPaiList("");
        //StringBuffer buf = new StringBuffer(500);
        return pinPais;
    }


}
