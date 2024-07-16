package com.springboot.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prac.entity.StudentEntity;
import com.springboot.prac.service.StudentService;

@RestController
@RequestMapping("/studentAPI")
public class StudentController {
	
	@Autowired
	StudentService stdser;
	@PostMapping("/saveStudent")
	public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity input){
		return new ResponseEntity<StudentEntity>(stdser.saveEmp(input),HttpStatus.CREATED);
		
	}

}
