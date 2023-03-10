package com.pedroenrick.course.repositories;

import com.pedroenrick.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
