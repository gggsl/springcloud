package com.gggsl.springcloud.provider.service.impl;

import com.gggsl.springcloud.api.entity.Dept;
import com.gggsl.springcloud.provider.dao.DeptDao;
import com.gggsl.springcloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public Integer addDept(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.selectOne(new Dept().setDeptNo(id));
    }

    @Override
    public List<Dept> listDept() {
        return deptDao.selectAll();
    }
}
