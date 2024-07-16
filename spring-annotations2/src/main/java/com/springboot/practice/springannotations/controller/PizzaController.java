package com.springboot.practice.springannotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.practice.springannotations.service.Pizza;
import com.springboot.practice.springannotations.service.VegPizza;

@Component
public class PizzaController {

	//@Autowired
	private Pizza pizza;

	
	  public PizzaController(@Qualifier("nonVegPizza") Pizza  Pizza) {
	  this.pizza=Pizza; } // *
	 

	/*
	 * @Autowired public void setVegpizza(VegPizza vegpizza) { this.vegpizza
	 * =vegpizza;
	 */
	public String getPizza() {
		return pizza.getPizza();
	}
	public void init() {
		System.out.println("init method called");
	}
public void destroy() {
	System.out.println("destroy method called");
}
}
