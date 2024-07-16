package com.springboot.prac.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.prac.entity.StudentEntity;
import com.springboot.prac.repository.StudentRepository;
import com.springboot.prac.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studRepo;
	
	

	@Override
	public StudentEntity saveEmp(StudentEntity inputData) {
		//return s.saveEmp(inputData);
		
		return studRepo.save(inputData);
		
		
		
		
		
	}
	
	

	
	
}
