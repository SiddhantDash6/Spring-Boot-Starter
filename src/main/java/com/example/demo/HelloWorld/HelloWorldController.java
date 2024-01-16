package com.example.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Simple Method 
	// URI - /helloworld
	// GET Method
//	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Kalyan", "Dash", "Hyd");
	}

}
