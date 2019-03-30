package com.dc.sb.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Slf4j
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurationSupport {

    //图片存放根路径
    @Value("${file.rootPath}")
    private String ROOT_PATH;
    //图片存放根目录下的子目录
    @Value("${file.sonPath}")
    private String SON_PATH;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String filePath = "file:" + ROOT_PATH + SON_PATH;
        log.debug("MyWebMvcConfigurerAdapter===filePath======"+filePath);
        //指向外部目录
        registry.addResourceHandler("/img/**").addResourceLocations(filePath);
        super.addResourceHandlers(registry);
    }
}