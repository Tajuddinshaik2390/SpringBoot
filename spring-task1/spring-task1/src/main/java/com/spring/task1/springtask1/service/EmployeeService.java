package com.spring.task1.springtask1.service;

import java.util.List;
import java.util.Optional;

import com.spring.task1.springtask1.Entity.EmployeeEntity;

public interface EmployeeService {

	EmployeeEntity saveEmp(EmployeeEntity e);

	List<EmployeeEntity> findAll();

	EmployeeEntity findById(int id);

	public void delete(int id);

	public EmployeeEntity update(int id);

	EmployeeEntity updateemployee(EmployeeEntity ee);
	 List<EmployeeEntity> getempsal(int salary); 
	 
	 
public void demo();

}
