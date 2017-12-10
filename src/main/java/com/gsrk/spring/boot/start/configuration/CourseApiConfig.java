package com.gsrk.spring.boot.start.configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.gsrk.spring.boot.start.resources.TopicResource;

@Configuration
@ApplicationPath("/")
public class CourseApiConfig extends ResourceConfig{
	
	
	@PostConstruct
	public void setup(){
		register(TopicResource.class);
	}

}
