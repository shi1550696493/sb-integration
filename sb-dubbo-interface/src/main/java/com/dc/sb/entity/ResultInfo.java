package com.dc.sb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回数据的结构
 * @param <T>
 */
@Data
public class ResultInfo<T> implements Serializable {
    /** 兼容layui返回的数据*/
    private int code;
    /** 记录的总条数*/
    private int count;
    /** 成功与否*/
    private boolean success;
    /** 错误信息*/
    private String msg;

    /** 返回的数据*/
    private T data;

    /**
     * 添加一个成功的静态方法
     * @return
     */
    public static ResultInfo succcessResultInfo()
    {
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setSuccess(true);
        resultInfo.setCode(0);
        resultInfo.setMsg("成功");
        return resultInfo;
    }

    /**
     * 失败的静态方法
     * @return
     */
    public static ResultInfo failResultInfo()
    {
        ResultInfo resultInfo=new ResultInfo();
        resultInfo.setCode(1);
        resultInfo.setSuccess(false);
        return resultInfo;
    }

}
