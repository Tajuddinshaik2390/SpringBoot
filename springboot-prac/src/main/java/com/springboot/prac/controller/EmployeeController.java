package com.springboot.prac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prac.EmployeeEntity.EmployeeEntity;

@RestController
@RequestMapping("api")
public class EmployeeController {
	private EmployeeEntity empp;

	@GetMapping("/empdetails")
	public EmployeeEntity getEmpDetails() {
		return new EmployeeEntity("tah", 0);

	}
//	@GetMapping("/listofdata")
//	public List<EmployeeEntity> listOfEmp(){
//		List<EmployeeEntity> ls=new ArrayList<>();
//		ls.add(new EmployeeEntity("ss", 0));
//		ls.add(new EmployeeEntity("sxs", 4));
//		return ls; 

	@GetMapping("/listofdata")
	public List<EmployeeEntity> listOfEmp() {
		List<EmployeeEntity> ls = new ArrayList<>();
		ls.add(new EmployeeEntity("xhv", 1));
		ls.add(new EmployeeEntity("gdcg", 2));
		return ls;

	}

	@GetMapping("/input/{name}/{age}")
	public EmployeeEntity inputfromcli(@PathVariable("name") String name, @PathVariable("age") int age) {

		return new EmployeeEntity(name, age);
	}

	@GetMapping("/query")
	public EmployeeEntity empquery(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {
		return new EmployeeEntity(name, age);

	}

}
