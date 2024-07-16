package ConfigFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.practice.springannotations.controller.PizzaController;
import com.springboot.practice.springannotations.service.NonVegPizza;
import com.springboot.practice.springannotations.service.Pizza;
import com.springboot.practice.springannotations.service.VegPizza;

@Configuration
public class Config {

	@Bean
	public Pizza vegPizza() {
		return new VegPizza();

	}

	@Bean
	public Pizza nonVegPizza() {
		return new NonVegPizza();

	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public PizzaController pizzaController() {
		return new PizzaController(nonVegPizza());

	}

}
