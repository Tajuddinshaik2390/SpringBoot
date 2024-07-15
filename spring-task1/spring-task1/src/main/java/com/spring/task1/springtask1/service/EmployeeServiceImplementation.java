package com.spring.task1.springtask1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.task1.springtask1.Entity.EmployeeEntity;
import com.spring.task1.springtask1.repository.EmplpyeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmplpyeeRepository er;

	
	public EmployeeEntity saveEmp(EmployeeEntity e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

	
	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

//	public List<EmployeeEntity> findAll() {
//
//		return er.findAll();
//
//	}

//	public Optional<EmployeeEntity> findById(int id){
//		
//		return er.findById(id);
//		

//	public void delete(int id) {
//		er.deleteById(id);
//	}
	
	public EmployeeEntity findById(int id) {
		// TODO Auto-generated method stub
		return er.getByEmpId(id);
	}

	
	@Transactional
	public void delete(int id) {

		er.deleteByEmpId(id);

	}

	public EmployeeEntity update(int id) {

		EmployeeEntity byEmpId = er.getByEmpId(id);

		byEmpId.setEmpId(byEmpId.getEmpId());
		byEmpId.setEmpName("taju");
		byEmpId.setEmpSalary(byEmpId.getEmpSalary());

		return er.save(byEmpId);

	}

	
	public EmployeeEntity updateemployee(EmployeeEntity ee) {

		EmployeeEntity byEmpId = er.getByEmpId(ee.getEmpId());

		EmployeeEntity updateemployee = new EmployeeEntity();
		updateemployee.setEmpId(ee.getEmpId());
		updateemployee.setEmpName(ee.getEmpName());
		updateemployee.setEmpSalary(ee.getEmpSalary());

		return er.save(updateemployee);
	}

	
	public List<EmployeeEntity> getempsal(int salary) {
				return er.getEmpSal(salary);
	}


	
	public void demo() {
		// TODO Auto-generated method stub
		
	}

}
