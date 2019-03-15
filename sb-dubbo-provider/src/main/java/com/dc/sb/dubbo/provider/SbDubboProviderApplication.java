package com.dc.sb.dubbo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.dc.sb.dubbo.provider.mapper")
public class SbDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDubboProviderApplication.class, args);
	}
}
