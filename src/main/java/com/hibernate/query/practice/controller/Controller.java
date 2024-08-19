package com.hibernate.query.practice.controller;

import com.hibernate.query.practice.entity.Department;
import com.hibernate.query.practice.repository.DepartmentRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping("/get")
    public List<Department> getDepartment(){
        //return departmentRepo.findWithoutNPlusOne();
        return departmentRepo.findAll();
    }
}
