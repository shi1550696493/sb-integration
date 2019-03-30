package com.dc.sb.service;

import com.dc.sb.entity.PinPai;
import com.dc.sb.entity.ResultInfo;

import java.util.List;

/**
 * @Auther: zj
 * @Date: 2018/10/11 14:10
 * @Description: 品牌
 */
public interface PinPaiService {
    /**
     * 根据品牌名称查询品牌信息
     * @param pinPaiName：
     * @return
     *
     */
    public List<PinPai> findPinPaiList(String pinPaiName);

    /**
     * 根据品牌id返回具体品牌信息
     * @param pinPaiId
     * @return
     */
    public PinPai findPinPaiById(String pinPaiId);

    /**
     * 修改品牌信息
     * @param pinPaiId
     * @param pinPai
     * @return
     */
    ResultInfo modifyPinPai(String pinPaiId, PinPai pinPai);

    ResultInfo delete(String pinPaiId);

    ResultInfo save(PinPai pinPai);
}
