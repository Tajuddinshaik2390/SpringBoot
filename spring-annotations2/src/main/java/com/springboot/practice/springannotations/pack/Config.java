package com.springboot.practice.springannotations.pack;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:name.properties")
public class Config {

}
