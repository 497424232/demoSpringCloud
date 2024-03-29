package com.cmk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther changmk
 * @date 2019/8/8 下午10:50
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductorApplication.class, args);
    }
}
