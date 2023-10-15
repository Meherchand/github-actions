package com.example.spring_docker.productcontroller;

import com.example.spring_docker.entity.Product;
import com.example.spring_docker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class ProductController{

	@Autowired
	private ProductService productService;


@GetMapping("/allproducts")
   public ResponseEntity<List<Product>> getProducts(){


		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);


		}



		@PostMapping("/saveproduct")
		public Product saveProduct(@RequestBody Product product){

			return productService.saveProduct(product);



		}





}
