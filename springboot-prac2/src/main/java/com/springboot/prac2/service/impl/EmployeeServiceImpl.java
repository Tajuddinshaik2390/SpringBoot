package com.springboot.prac2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.prac2.entity.EmployeeEntity;
import com.springboot.prac2.exception.ResourceNotFoundException;
import com.springboot.prac2.repository.EmployeeRepository;
import com.springboot.prac2.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository emprepo;

	public EmployeeServiceImpl(EmployeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public EmployeeEntity empsave(EmployeeEntity empinputt) {
		return emprepo.save(empinputt);
	}

	@Override
	public List<EmployeeEntity> getAllEmployees() {
		return emprepo.findAll();
	}

	@Override
	public EmployeeEntity getEmployeeById(int id) {

//	Optional<EmployeeEntity> emp= emprepo.findById(id) ;
//	if(emp.isPresent()) {
//		return emp.get();
//	}
//	else {
//		throw new ResourceNotFoundException("EmployeeEntity","id","id");
//	}
		return emprepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("EmployeeEntity", "id", id));
	}

	@Override
	public EmployeeEntity updateEmp(EmployeeEntity emp, int id) {
		// EmployeeEntity empref = new EmployeeEntity();
		EmployeeEntity empref = emprepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("EmployeeEntity", "id", id));
		// empref.setId(emp.getId());
		empref.setDept(emp.getDept());
		empref.setEmail(emp.getEmail());
		empref.setName(emp.getName());

		emprepo.save(empref);
		return empref;
	}

	@Override
	public void deleteEmp(int id) {
		EmployeeEntity empp = emprepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("EmployeeEntity", "id", id));

		emprepo.deleteById(id);

	}

}
