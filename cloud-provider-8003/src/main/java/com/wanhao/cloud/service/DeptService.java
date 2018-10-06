package com.wanhao.cloud.service;

import com.wanhao.cloud.bean.Dept;

import java.util.List;


public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
