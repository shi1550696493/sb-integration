package com.dc.sb.web.controller.mock;


import com.github.tomakehurst.wiremock.client.WireMock;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class MockServer {
    public static void main(String[] args) throws IOException {
        WireMock.configureFor("127.0.0.1", 8080);
        WireMock.removeAllMappings(); // 清空原来配置

        mock("/user/1", "user1.json");
       /* mock("/user/2", "user2.json");
        mock("/user/3", "user3.json");*/
    }

    private static void mock(String url, String fileName) throws IOException {
        ClassPathResource resource = new ClassPathResource("mock/" + fileName);
        String content = StringUtils.join(FileUtils.readLines(
                resource.getFile(), "UTF-8"), "\n");
        WireMock.stubFor(
                // 收到/user/1请求时的处理
                WireMock.get(WireMock.urlEqualTo(url))
                        .willReturn(
                                WireMock.aResponse()
                                        // 返回的状态码
                                        .withStatus(200)
                                        // 返回的JSON串
                                        .withBody(content)));
    }
}
//---------------------
//        作者：CaniculaJim
//        来源：CSDN
//        原文：https://blog.csdn.net/Linjingke32/article/details/80789105
//        版权声明：本文为博主原创文章，转载请附上博文链接！