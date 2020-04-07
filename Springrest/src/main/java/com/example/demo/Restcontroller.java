


package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.LifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	@Autowired
	restrepo repo;

	@GetMapping(path="/get/{id}")
	@ResponseBody
public Optional<Customer> get(@PathVariable("id") Integer id)
{
		System.out.println("called save............");
return repo.findById(id);
		
		
		
	
	
}
}
