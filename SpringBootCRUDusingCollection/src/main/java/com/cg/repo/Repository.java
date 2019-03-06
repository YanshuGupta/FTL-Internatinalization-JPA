package com.cg.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.beans.Employee;

@Service
public class Repository {
	List<Employee> list = new ArrayList<>();
	
	public Repository() {
		list.add(new Employee(123, "Yanshu Gupta", "Manager"));
		list.add(new Employee(123, "Yatharth Dubey", "HR"));
	}
	
	public List<Employee> getAllUsers(){
		return list;  
        
    }  
    public Employee getUser(int id){
    	for(Employee emp: list){
    		if(id == emp.getId())
    			return emp;
    	}
    	return null;
         
    }  
    public boolean addUser(Employee employee){  
        list.add(employee);
        return true;
    }  
    public boolean delete(int id){  
       Iterator<Employee> iterator = list.iterator();
       while(iterator.hasNext()) {
    	   Employee emp = iterator.next();
    	   if(emp.getId() == id) {
    		   iterator.remove();
    		   return true;
    	   }
       }
       return false;
    }  
}
