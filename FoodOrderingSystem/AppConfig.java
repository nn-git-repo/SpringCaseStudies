package com.example.food;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	 @Bean
	    public Customer customer() {
	        return new Customer("Namratha", "9876543210", "Indian");
	    }

	    @Bean
	    public Restaurant restaurant() {
	        return new Restaurant("Spice Hub", "Bangalore", new String[]{"Indian", "Chinese"});
	    }

	    @Bean
	    public FoodOrderService orderService() {
	        return new FoodOrderService(customer(), Arrays.asList(restaurant()));
	    }
}
