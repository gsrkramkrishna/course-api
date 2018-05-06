package com.gsrk.spring.boot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class CourseApi {
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApi.class, args);
		System.out.println("Gootley...");
	}

}
