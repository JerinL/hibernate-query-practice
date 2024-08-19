package com.hibernate.query.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department", schema = "my_schema")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String deptId;
    private String deptName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private List<Employee> employees;

}
