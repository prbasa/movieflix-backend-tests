package com.devsuperior.movieflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class MovieflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieflixApplication.class, args);
	}

}
