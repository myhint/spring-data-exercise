package com.blake.dev.springdataexercise.service.impl;

import com.blake.dev.springdataexercise.entity.Department;
import com.blake.dev.springdataexercise.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Blake on 2018/10/4
 */
@Service
@CacheConfig(cacheManager = "deptRedisCacheManager")
public class DepartmentServiceImpl implements DepartmentService {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    private DepartmentMapper departmentMapper;

    @Cacheable(value = "dept")
    @Override
    public Department getDepartment(Integer id) {

        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void createDepartment(Department department) {

        departmentMapper.insert(department);
        logger.info("============= {}", department.getId());
    }
}
