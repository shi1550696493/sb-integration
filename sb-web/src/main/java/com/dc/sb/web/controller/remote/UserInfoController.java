package com.dc.sb.web.controller.remote;

import com.dc.sb.entity.ResultInfo;
import com.dc.sb.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zj
 * @Date: 2018/10/22 14:32
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserInfoController {

    @PostMapping("regist")
    public ResultInfo regist(@RequestBody UserInfo userInfo) {
        String str = ReflectionToStringBuilder.toString(userInfo, ToStringStyle.MULTI_LINE_STYLE);
        log.debug("str========"+str);

        ResultInfo resultInfo=ResultInfo.succcessResultInfo();
        return resultInfo;
    }
}
