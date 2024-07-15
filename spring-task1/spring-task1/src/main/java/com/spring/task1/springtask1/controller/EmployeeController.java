package com.spring.task1.springtask1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task1.springtask1.Entity.EmployeeEntity;
import com.spring.task1.springtask1.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@PostMapping(value = "/save")
	public EmployeeEntity create(@RequestBody EmployeeEntity e) {
		es.saveEmp(e);
		return e;

	}

	@GetMapping(value = "/get")
	public List<EmployeeEntity> getAll() {
//		List<EmployeeEntity> data= es.findAll().stream().filter(x-> x.getEmpId()%2==0).collect(Collectors.toList());
//		data.forEach(x->System.out.println(x));
//		
//		return  data;
		return es.findAll();

	}

	@GetMapping("/getById/{id}")
	public EmployeeEntity getById(@PathVariable int id) {

		return es.findById(id);// .map(ResponseEntity::ok);

	}

	@GetMapping("/getempsal/{salary}")
	public List<EmployeeEntity> getempsal(@PathVariable("salary") int salary) {
		return es.getempsal(salary);
	}

//	@DeleteMapping("deleteById/{id}")
//	public ResponseEntity<String> delete(@PathVariable int id) {
//		return ResponseEntity.ok("id deleted");
//		}

	@DeleteMapping("deleteById/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		es.delete(id);
		return ResponseEntity.ok("id deleted");
	}

//	@PutMapping(value = "/update/{id}")
//	public EmployeeEntity update(@PathVariable int id) {
//		EmployeeEntity update = es.update(id);
//		return update;
//		
//	}

	@PutMapping(value = "/update")
	public EmployeeEntity update(@RequestBody EmployeeEntity ee) {
		EmployeeEntity update = es.updateemployee(ee);
		return update;

	}

}
