package com.dc.sb.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dc.sb.dubbo.provider.mapper.IndentMapper;
import com.dc.sb.entity.Indent;
import com.dc.sb.service.IndentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = IndentService.class)
public class IndentServiceImpl implements IndentService{

    @Autowired
    private IndentMapper indentMapper;
    private static long orderNum = 0l;
    private static String date ;
    @Override
    public void addIndent(Indent indent) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        indent.setOrderTime(df.format(new Date()));
        indent.setSerialNumber(IndentServiceImpl.getOrderNo());
        indentMapper.insertSelective(indent);
    }
    /**
     * 生成订单编号
     * @return
     */
    public static synchronized String getOrderNo() {
        String str = new SimpleDateFormat("yyMMddHHmm").format(new Date());
        if(date==null||!date.equals(str)){
            date = str;
            orderNum  = 0l;
        }
        orderNum ++;
        long orderNo = Long.parseLong((date)) * 10000;
        orderNo += orderNum;;
        return orderNo+"";
    }
}
