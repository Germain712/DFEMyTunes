package com.qa.dfemytunes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class DfeMyTunesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfeMyTunesApplication.class, args);
	}

}
