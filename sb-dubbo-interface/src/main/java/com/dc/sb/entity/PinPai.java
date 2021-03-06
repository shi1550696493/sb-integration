package com.dc.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: zj
 * @Date: 2018/10/11 14:05
 * @Description:
 * 品牌实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PinPai implements Serializable {
    /** 主键*/
    private Integer id;
    /** 品牌名称*/
    private String pinPaiName;
    /** 品牌logo的图片*/
    private String imgUrl;

}
