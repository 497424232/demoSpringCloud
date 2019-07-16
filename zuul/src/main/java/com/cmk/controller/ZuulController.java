package com.cmk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther changmk
 * @date 2019/7/15 下午9:54
 */
@RestController
public class ZuulController {

    @Value("${server.port}")//获取配置文件中的值，并赋值给port
    private String port;

    @GetMapping("/index")
    public String index() {
        return "当前端口" + this.port;
    }
}
