package com.abutua.productbackend.repositories;

import com.abutua.productbackend.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Integer>{
}
