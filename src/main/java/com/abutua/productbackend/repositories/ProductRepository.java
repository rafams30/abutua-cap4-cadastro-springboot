package com.abutua.productbackend.repositories;

import com.abutua.productbackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer>{
}
