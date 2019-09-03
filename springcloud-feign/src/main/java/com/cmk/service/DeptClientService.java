package com.cmk.service;

import com.cmk.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @auther changmk
 * @date 2019/8/8 下午10:40
 */
@Service
@FeignClient(value = "consumer")
public interface DeptClientService {

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> getAll();

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept getById(@PathVariable("id") int id);

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(@RequestBody Dept dept);
}
