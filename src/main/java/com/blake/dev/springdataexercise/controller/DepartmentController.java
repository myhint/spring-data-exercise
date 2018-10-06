package com.blake.dev.springdataexercise.controller;

import com.blake.dev.springdataexercise.entity.Department;
import com.blake.dev.springdataexercise.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Blake on 2018/10/4
 */
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department getDept(@PathVariable Integer id) {

        return departmentService.getDepartment(id);
    }

    @PostMapping
    public void createDept(@RequestBody Department department) {

        departmentService.createDepartment(department);
    }

}
