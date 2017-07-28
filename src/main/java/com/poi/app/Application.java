package com.poi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan( basePackages = { "com.poi" } )
@EnableMongoRepositories(basePackages = {"com.poi.repository"})
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(new Object[] { Application.class }, args);
	}
}