package com.dc.sb.web.controller.remote;

import com.dc.sb.entity.LoginUser;
import com.dc.sb.entity.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zj
 * @Date: 2018/10/19 16:12
 * @Description:
 * 登录管理
 */
@Slf4j
@RestController
@RequestMapping("api/login")
public class loginController {

    @PostMapping("check")
    public ResultInfo check(@RequestBody LoginUser user) {
        String str=user.toString();
        log.debug("str========="+str);
        ResultInfo resultInfo=ResultInfo.succcessResultInfo();

        return resultInfo;
    }
}
