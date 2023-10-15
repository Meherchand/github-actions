package com.example.spring_docker.service;

import com.example.spring_docker.entity.Product;
import com.example.spring_docker.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;


	public Product saveProduct(Product product)
	{
		return  productRepo.save(product);
	}


	public List<Product> getAllProducts(){

		return productRepo.findAll();
	}

}
