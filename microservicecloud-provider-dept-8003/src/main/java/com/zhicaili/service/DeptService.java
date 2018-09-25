package com.zhicaili.service;

import com.zhicaili.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
