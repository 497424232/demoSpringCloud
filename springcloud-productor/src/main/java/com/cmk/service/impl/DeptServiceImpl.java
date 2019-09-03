package com.cmk.service.impl;

import com.cmk.entity.Dept;
import com.cmk.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther changmk
 * @date 2019/8/8 下午10:40
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Override
    public List<Dept> getAll() {
        List<Dept> list = new ArrayList<>();
        list.add(new Dept(1, "111", "xxx"));
        list.add(new Dept(2, "222", "xxx"));
        list.add(new Dept(3, "333", "xxx"));
        return list;
    }

    @Override
    public boolean add(Dept dept) {

        return true;
    }

    @Override
    public Dept getById(int id) {
        return new Dept(4, "444", "xxxx");
    }
}
