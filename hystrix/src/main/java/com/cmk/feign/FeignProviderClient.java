package com.cmk.feign;

import com.cmk.entity.Student;
import com.cmk.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @auther changmk
 * @date 2019/7/15 下午10:26
 */
//fallback 降级处理，调用出错时调用FeignError方法
@FeignClient(value = "provider", fallback = FeignError.class)
@Service
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
