package com.springboot.prac2.service;

import java.util.List;

import com.springboot.prac2.entity.EmployeeEntity;

public interface EmployeeService {
	public EmployeeEntity empsave(EmployeeEntity empinputt);
	public List<EmployeeEntity> getAllEmployees();
	public EmployeeEntity getEmployeeById(int id);
	
	public EmployeeEntity updateEmp(EmployeeEntity emp,int id);
	
	public void deleteEmp(int id);

}
