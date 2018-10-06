package com.blake.dev.springdataexercise.service;

import com.blake.dev.springdataexercise.entity.Department;

/**
 * Created by Blake on 2018/10/4
 */
public interface DepartmentService {

    Department getDepartment(Integer id);

    void createDepartment(Department department);
}
