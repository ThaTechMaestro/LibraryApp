package com.project.libraryapptest.repository;

import com.project.libraryapptest.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
