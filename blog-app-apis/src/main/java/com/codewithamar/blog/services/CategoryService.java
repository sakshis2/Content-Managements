package com.codewithamar.blog.services;

import java.util.List;

import com.codewithamar.blog.payloads.CategoryDto;

//create  interface first because to make it loose coupled

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	
	//get single category
	CategoryDto getCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getCategories();
}
