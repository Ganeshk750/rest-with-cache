package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching  //to enable the caching
public class SpringBootRadisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRadisApplication.class, args);
	}

}
