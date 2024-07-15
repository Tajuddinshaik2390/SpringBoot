package com.spring.task1.springtask1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.spring.task1.springtask1.Entity.EmployeeEntity;


public interface EmplpyeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	public EmployeeEntity getByEmpId(int id);

	public int deleteByEmpId(int id);

	@Query(value = "select *  from employee_entity group by emp_salary  having emp_salary>:emp_salary", nativeQuery = true)
	public List<EmployeeEntity> getEmpSal(@Param("emp_salary") int salary);
	
	}
