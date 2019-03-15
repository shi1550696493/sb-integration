package com.dc.sb.web.controller.remote;
import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.User;
import com.dc.sb.service.User2Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/add")
public class User2Controller {

    @Reference(version = "1.0.0")
    private User2Service user2Service;
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        try {
            user2Service.addUser(user);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "添加失败";
    }

}
