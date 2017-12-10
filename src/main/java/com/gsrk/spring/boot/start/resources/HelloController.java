package com.gsrk.spring.boot.start.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHey(){
		return "Hey Gootely....";
	}

}
