package com.cmk.feign.impl;

import com.cmk.entity.Student;
import com.cmk.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @auther changmk
 * @date 2019/7/15 下午10:38
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。";
    }
}
