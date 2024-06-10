package com.customQuery.customQuery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CustomQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomQueryApplication.class, args);
	}

}
