package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.beans.Employee;
import com.cg.repo.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repository repo;
	
	public List<Employee> getAllUsers(){
		return repo.getAllUsers();
        
    }  
    public Employee getUser(int id){
		return repo.getUser(id);
         
    }  
    public boolean addUser(Employee employee){  
        return repo.addUser(employee);
    }  
    public boolean delete(int id){  
       return repo.delete(id);
    }  
}
