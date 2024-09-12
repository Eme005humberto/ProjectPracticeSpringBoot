package com.example.Project.DAO;

import java.util.List;

import com.example.Project.Model.Products;

public interface ProductsDAO {

	public List<Products> allListProducts();
	
	public int createProduct(Products model);
	
	public int updateProduct(Products model);
	
	public int deleteProduct(int id);
	
	public Products findById(int id);
}
