package com.sac.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sac.practice.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
