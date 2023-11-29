package com.company.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class })// resulrve el problema de
//Error creating bean with name 'handlerExceptionResolver'
@SpringBootApplication
public class InventorySpring3Application {
	public static void main(String[] args) {
		SpringApplication.run(InventorySpring3Application.class, args);
	}

}
