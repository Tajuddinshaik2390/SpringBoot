package com.springboot.practice.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {
	@Value("${defaultvalue:TAJUDDIN}")
	
	private String defaultname;

	public String getDefaultname() {
		return defaultname;
	}
	

}
