package com.springboot.prac2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prac2.entity.EmployeeEntity;
import com.springboot.prac2.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

	private EmployeeService empserv;

	public EmployeeController(EmployeeService empserv) {
		super();
		this.empserv = empserv;
	}

	@PostMapping("save")
	public ResponseEntity<EmployeeEntity> empsave(@RequestBody EmployeeEntity empinput) {

		return new ResponseEntity<EmployeeEntity>(empserv.empsave(empinput), HttpStatus.CREATED);

	}

	@GetMapping("getAllEmployees")
	public List<EmployeeEntity> getAllEmployees() {
		return empserv.getAllEmployees();
	}

	@GetMapping("/findbyId/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") int id) {

		return new ResponseEntity<EmployeeEntity>(empserv.getEmployeeById(id), HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeeEntity> updateEmp(@PathVariable("id") int id, @RequestBody EmployeeEntity empObj) {

		return new ResponseEntity<EmployeeEntity>(empserv.updateEmp(empObj, id), HttpStatus.OK);

	}
//@DeleteMapping("deleteEmp/{id}")
//public ResponseEntity<EmployeeEntity> deleteEmp(@PathVariable int id){
//	empserv.deleteEmp(id);
//	return new ResponseEntity<EmployeeEntity>(HttpStatus.OK);
//	
//}

	@DeleteMapping("deleteEmp/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") int id){
		empserv.deleteEmp(id);
		return new ResponseEntity<String>("employee deleted",HttpStatus.OK);
		
	}

}
