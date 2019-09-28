package com.example.demo20.controller;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo20.beans.Employee;

@RestController
public class MyController {
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView hello(Model model) { 
				
		String message = messageSource.getMessage("welcome.user.message", new String[] {"Yanshu", String.valueOf(LocalDate.now())}, LocaleContextHolder.getLocale());
//		message = MessageFormat.format(message,  "Yanshu", String.valueOf(LocalDate.now()));
		model.addAttribute("message", message);

		model.addAttribute("name", "Yanshu Gupta");
		
		List<String> list = new LinkedList<>();
		list.add("Yanshu");
		list.add("Deepanshu");
		list.add("Darvin");
		list.add("Nilesh");
		
		model.addAttribute("list", list);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100, "Yanshu Gupta"));
		empList.add(new Employee(101, "Pushkar Gupta"));
		empList.add(new Employee(102, "Dev Gupta"));
		
		model.addAttribute("empList", empList);
		
		return new ModelAndView("hello");
	}
}
