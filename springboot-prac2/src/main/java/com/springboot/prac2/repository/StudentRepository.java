package com.springboot.prac2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prac.Entity.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity,String>{
	

}
