package com.example.cicdspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class CicdSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdSpringbootApplication.class, args);
	}


}
