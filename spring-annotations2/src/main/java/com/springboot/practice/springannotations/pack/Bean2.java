package com.springboot.practice.springannotations.pack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {

	@Value("${com.name}")
	public String name;
	@Value("${com.age}")
	public int age; 
//	@Value("${HOME}")
//	public String homedir;
//	@Value("${java.dir}")
//	public String javaDir;

//	public String getJavaDir() {
//		return javaDir;
//	}
//
//	public String getHomeDir() {
//		return homedir;
//	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
