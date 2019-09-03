package com.cmk.service;

import com.cmk.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther changmk
 * @date 2019/8/8 下午10:40
 */
@Service
public interface DeptService {

    List<Dept> getAll();

    Dept getById(int id);

    boolean add(Dept dept);
}
