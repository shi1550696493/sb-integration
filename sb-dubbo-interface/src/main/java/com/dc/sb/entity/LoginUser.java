package com.dc.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: zj
 * @Date: 2018/10/19 16:15
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser implements Serializable {
    /** 登录名*/
    private String loginName;
    /** 密码*/
    private String password;
    /** 验证码*/
    private String validCode;

}
