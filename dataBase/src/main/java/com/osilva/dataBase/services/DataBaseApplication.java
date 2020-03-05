package com.osilva.dataBase.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class DataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}

}
