package com.example.spring_docker.repository;

import com.example.spring_docker.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository< Product,Integer> {



}
