package com.example.Project.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Project.DAO.ProductsDAO;
import com.example.Project.Model.Products;

@Service
public class ProductsServiceImplement implements ProductsService{

	/*Inyectamos el servicio de productsDAO*/
	private ProductsDAO productsDAO;
	
	@Transactional
	@Override
	public List<Products> allProducts() {
		return productsDAO.allListProducts(); //Devolvemos la lista de productos
	}

	@Override
	public int addProduct(Products model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProduct(Products model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Products findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
