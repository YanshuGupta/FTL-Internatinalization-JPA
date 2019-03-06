package com.cg.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Employee;
import com.cg.service.Service;


@RestController
public class EmployeeController {

	@Autowired
    private Service service;   
	
	@RequestMapping("/")  
    public List<Employee> getAllUser(){  
        return service.getAllUsers();  
    }     
    @RequestMapping(value="/add-user", method=RequestMethod.POST)  
    public void addUser(@RequestBody Employee employee){  
        service.addUser(employee);  
    }  
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET)  
    public Employee getUser(@PathVariable int id){  
        return service.getUser(id);  
    }  
	
	
}
