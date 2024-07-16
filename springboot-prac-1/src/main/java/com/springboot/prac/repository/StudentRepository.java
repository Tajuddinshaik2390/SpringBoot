package com.springboot.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.prac.entity.StudentEntity;

public interface StudentRepository  extends JpaRepository<StudentEntity, Integer>{

}

