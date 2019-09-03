package com.cmk.controller;

import com.cmk.entity.Dept;
import com.cmk.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @auther changmk
 * @date 2019/8/8 下午11:03
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService service;


    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> getAll() {
        return service.getAll();

    }

    @RequestMapping(value = "/consumer/index")
    public String index() {
        return service.toString();
    }


}
