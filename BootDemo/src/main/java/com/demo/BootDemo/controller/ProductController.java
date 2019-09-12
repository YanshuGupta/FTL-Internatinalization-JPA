package com.demo.BootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.BootDemo.model.Product;
import com.demo.BootDemo.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productService;

	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public List<Product> showAll() {
		productService.addProduct(new Product(1234, "abc"));
		return productService.showAll();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<String> showLangs() {
		return productService.showLangs();
	}
}
