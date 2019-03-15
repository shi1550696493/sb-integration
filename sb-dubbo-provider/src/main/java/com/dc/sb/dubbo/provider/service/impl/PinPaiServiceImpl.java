package com.dc.sb.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dc.sb.dubbo.provider.mapper.TPinpaiMapper;
import com.dc.sb.dubbo.provider.model.TPinpai;
import com.dc.sb.entity.PinPai;
import com.dc.sb.entity.ResultInfo;
import com.dc.sb.service.PinPaiService;
import com.dc.sb.service.RemoteUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zj
 * @Date: 2018/10/11 14:14
 * @Description:
 */
@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = PinPaiService.class)
public class PinPaiServiceImpl implements PinPaiService {
    @Autowired
    private TPinpaiMapper pinpaiMapper;

    @Override
    public List<PinPai> findPinPaiList(String pinPaiName) {
        List<TPinpai> pinPaiList = pinpaiMapper.findAll();
        List<PinPai> pinPais = new ArrayList<>();
        for (int i = 0; i < pinPaiList.size(); i++) {
            TPinpai tPinpai = pinPaiList.get(i);
            // PinPai pinPai = new PinPai(tPinpai.getId(), tPinpai.getPinPaiName(), tPinpai.getImgUrl());
            PinPai pinPai = new PinPai();
            BeanUtils.copyProperties(tPinpai, pinPai);
            pinPais.add(pinPai);
        }
        return pinPais;
    }

    @Override
    public PinPai findPinPaiById(String pinPaiId) {
        TPinpai tpp = pinpaiMapper.selectByPrimaryKey(Integer.parseInt(pinPaiId));
        PinPai pinPai = new PinPai();
        BeanUtils.copyProperties(tpp, pinPai);
        return pinPai;
    }

    @Override
    public ResultInfo modifyPinPai(String pinPaiId, PinPai pinPai) {
        TPinpai tPinpai=new TPinpai(Integer.parseInt(pinPaiId),pinPai.getPinPaiName(),pinPai.getImgUrl());
        int t= pinpaiMapper.updateByPrimaryKey(tPinpai);
        ResultInfo result= ResultInfo.failResultInfo();
        if (t > 0) {
            result=ResultInfo.succcessResultInfo();
            result.setMsg("更新成功！");
        }
        else
        {

            result.setMsg("更新失败：更新的记录条数为0!");
        }
        return result;

    }
}
