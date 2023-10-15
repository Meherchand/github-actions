package com.example.spring_docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer product_id;

	String productName;
}
