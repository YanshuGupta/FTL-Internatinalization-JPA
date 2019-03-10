package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Person;
import com.capgemini.service.IService;

@RestController
public class MyController {
	
	@Autowired
	IService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/search/{id}")
	public Person search(@PathVariable int id) {
		return service.search(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/createPerson")
	public Person CreatePerson(@RequestBody Person person) {
		return service.createPerson(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updatePerson")
	public Person updatePerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete")
	public boolean deletePerson(@RequestParam("id") int id) {
		return service.deletePerson(id);
	}
}
