package com.codewithamar.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithamar.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
 