package com.springboot.prac2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.prac2.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	
	//public EmployeeEntity empSave(EmployeeEntity empinput);
	//public List< EmployeeEntity> findAll();

}
