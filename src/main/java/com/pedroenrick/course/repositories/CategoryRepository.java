package com.pedroenrick.course.repositories;

import com.pedroenrick.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}

