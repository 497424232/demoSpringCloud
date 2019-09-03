package com.cmk.controller;

import com.cmk.entity.Dept;
import com.cmk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther changmk
 * @date 2019/8/8 下午10:43
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> getList() {
        return deptService.getAll();
    }

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "productor index";
    }

}
