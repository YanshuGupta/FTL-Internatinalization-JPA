package com.demo.BootDemo.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.BootDemo.dao.IProductRepo;
import com.demo.BootDemo.model.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	IProductRepo productRepository;

	public List<Product> showAll() {
		return (List<Product>) productRepository.findAll();
	}

	public List<String> showLangs() {
		return new LinkedList<>(Arrays.asList("java", "pega", "react", "node", "angular"));
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}
}
