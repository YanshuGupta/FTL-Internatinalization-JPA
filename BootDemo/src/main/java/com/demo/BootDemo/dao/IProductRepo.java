package com.demo.BootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.BootDemo.model.Product;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

}
