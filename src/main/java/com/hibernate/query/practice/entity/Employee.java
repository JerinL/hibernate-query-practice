package com.hibernate.query.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee", schema = "my_schema")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String empId;
    private String empName;

}
