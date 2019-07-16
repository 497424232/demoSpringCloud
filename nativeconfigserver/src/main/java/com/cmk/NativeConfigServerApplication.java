package com.cmk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther changmk
 * @date 2019/7/16 上午10:41
 */
@SpringBootApplication
@EnableConfigServer//声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class, args);
    }
}
