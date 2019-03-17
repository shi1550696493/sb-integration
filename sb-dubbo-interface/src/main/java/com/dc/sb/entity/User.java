package com.dc.sb.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer userid;

    private String username;

    private String password;

    private String phone;

    private Integer state;

    private Integer deleteState;

    private String startTime;

    private String endTime;

    private Double summation;

}