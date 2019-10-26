package com.ww.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${dev.config.db.url}")
    private String url;
    @Value("${dev.config.db.username}")
    private String userName;
    @Value("${dev.config.db.password}")
    private String passWord;

    @GetMapping("/test")
    public String test() {
        return "url:" + url + "," + "userName:" + userName + "," + "passWord:" + passWord;
   }
}
