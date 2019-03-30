package com.dc.sb.web.controller.remote;

import com.dc.sb.entity.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 *文件上传接口
 */
@RequestMapping("api/fileupload")
@RestController
@Slf4j
public class fileUploadController {

    //图片存放根路径
    @Value("${file.rootPath}")
    private String ROOT_PATH;
    //图片存放根目录下的子目录
    @Value("${file.sonPath}")
    private String SON_PATH;


    @PostMapping("/upload")
    public ResultInfo upload(@RequestParam("file")MultipartFile file) throws IOException {
        ResultInfo resultInfo = ResultInfo.succcessResultInfo();
        try {
            String uploadDir=ROOT_PATH + SON_PATH;
            log.debug("file===="+file.getOriginalFilename());
            file.transferTo(new File(uploadDir+file.getOriginalFilename()));
            resultInfo.setData("/img/"+file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return resultInfo;
    }


}
