package com.hibernate.query.practice.repository;

import com.hibernate.query.practice.entity.Department;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,String> {

//    @Query("SELECT p FROM Department p LEFT JOIN FETCH p.listOfEmployees")
//    List<Department> findWithoutNPlusOne();

    @Query("SELECT d FROM Department d LEFT JOIN FETCH d.employees")
    List<Department> findWithoutNPlusOne();

    @EntityGraph(attributePaths = {"employees"})
    List<Department> findAll();
}
