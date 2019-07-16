package com.cmk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther changmk
 * @date 2019/7/16 上午10:53
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @RequestMapping("/index")
    public String index() {
        return this.port + "-" + this.foo;
    }

}
