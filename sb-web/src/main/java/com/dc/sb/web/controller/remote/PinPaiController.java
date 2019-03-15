package com.dc.sb.web.controller.remote;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.PinPai;
import com.dc.sb.entity.ResultInfo;
import com.dc.sb.service.PinPaiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: zj
 * @Date: 2018/10/17 14:19
 * @Description:
 */
@RequestMapping("/api/pinPai")
@RestController
public class PinPaiController {

    @Reference(version = "1.0.0")
    private PinPaiService pinPaiService;

    @GetMapping("{pinPainId}")
    public ResultInfo<PinPai> findPinPai(@PathVariable String pinPainId) {
        ResultInfo<PinPai> resultInfo=ResultInfo.failResultInfo();
        try {
            PinPai pp=    pinPaiService.findPinPaiById(pinPainId);
            resultInfo.setData(pp);
            resultInfo.setSuccess(true);
        } catch (Exception e) {
            //e.printStackTrace();
            resultInfo.setMsg("查询时出现错误："+e.getMessage());
        }
        return resultInfo;
    }

    @GetMapping("findPinPai")
    public List<PinPai> findPinPai() {
        List<PinPai> pinPais = pinPaiService.findPinPaiList("");
        //StringBuffer buf = new StringBuffer(500);
        return pinPais;
    }

    @PutMapping("{pinPaiId}")
    public ResultInfo modifyPinPai(@PathVariable String pinPaiId,@RequestBody PinPai pinPai) {
        ResultInfo resultInfo=pinPaiService.modifyPinPai(pinPaiId, pinPai);
        return resultInfo;
    }
}
