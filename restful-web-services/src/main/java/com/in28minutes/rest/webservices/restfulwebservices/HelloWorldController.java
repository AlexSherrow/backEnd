package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

//Controller
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	//Get
	//URI - /hello-world
	//method - "Hello World"
	@GetMapping(path = "/hello-world")
	
	public String helloWorld() {
		return "Hello World!";
	}
	
	//Hello-World-bean
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	

}
