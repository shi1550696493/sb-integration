package com.dc.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: zj
 * @Date: 2018/10/22 14:34
 * @Description:
 * 用户信息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    /** 用户名*/
    private String userName;
    /** 密码*/
    private String passwd;
    /** 手机号*/
    private String tel;
    /** 验证码*/
    private String validCode;

}
