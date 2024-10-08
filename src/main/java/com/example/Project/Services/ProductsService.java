package com.example.Project.Services;
import java.util.List;

import com.example.Project.Model.Products;

public interface ProductsService{
	
	public List<Products> allProducts();
	
	public int addProduct(Products model);
	
	public int updateProduct(Products model);
	
	public int deleteProduct(int id);
	
	public Products findById(int id);
}
