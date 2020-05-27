package com.api.LocationsAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(value = {"com.api"})
@EntityScan(value = {"com.api"})
@EnableJpaRepositories("com.api")
public class LocationsApiApplication {

	public static void main(final String[] args) {
		SpringApplication.run(LocationsApiApplication.class, args);
	}

}
