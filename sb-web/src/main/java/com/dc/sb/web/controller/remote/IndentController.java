package com.dc.sb.web.controller.remote;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dc.sb.entity.Indent;
import com.dc.sb.entity.User;
import com.dc.sb.service.IndentService;
import com.dc.sb.service.User2Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/indent")
public class IndentController {
    @Reference(version = "1.0.0")
    private IndentService indentService;

    @PostMapping("indent")
    public String addIndent(@RequestBody Indent indent){
        try {
            indentService.addIndent(indent);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "添加失败";
    }


}
