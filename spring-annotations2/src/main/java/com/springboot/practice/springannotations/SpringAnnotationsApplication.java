package com.springboot.practice.springannotations;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.practice.springannotations.controller.PizzaController;
import com.springboot.practice.springannotations.pack.Bean2;
import com.springboot.practice.springannotations.pack.SourceBean;
import com.springboot.practice.springannotations.service.NonVegPizza;
import com.springboot.practice.springannotations.service.VegPizza;
import com.springboot.practice.springannotations.value.ValueDemo;

import ConfigFile.Config;

@SpringBootApplication
//@ComponentScan("ConfigFile")
public class SpringAnnotationsApplication implements CommandLineRunner {
	//@Autowired
	//private ValueDemo vd;
//	@Autowired
//	private NonVegPizza nvp;
//	@Autowired
//	private VegPizza vp;
	
	@Autowired
	private ApplicationContext app;
	@Autowired
	//private Bean2 bb;
//	
//	@Autowired
//	private PizzaController pc;

	public static void main(String[] args) {
		SpringApplication.run(SpringAnnotationsApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		// ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);

//		 NonVegPizza nvp=this.appContext.getBean(NonVegPizza.class);
//		 System.out.println(nvp.getPizza());
		//System.out.println(this.pc.getPizza());

		//System.out.println(this.vd.getDefaultname());
		SourceBean sb=  app.getBean(SourceBean.class);
		System.out.println(sb.getGmail());
		System.out.println(sb.getHost());
		System.out.println(sb.getPassword());
		System.out.println(sb.getMedia());
		System.out.println(sb.getAppname());
		Bean2 b=app.getBean(Bean2.class);
		System.out.println(b.getAge()+" "+b.getName());
//		System.out.println(this.bb.getHomeDir());
//		System.out.println(this.bb.getJavaDir());
		
		
	}
}
