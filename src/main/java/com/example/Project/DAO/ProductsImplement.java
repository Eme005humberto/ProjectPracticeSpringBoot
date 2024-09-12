package com.example.Project.DAO;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Project.Model.Products;

public class ProductsImplement implements ProductsDAO {

	//Inyectamos el servicio para interactuar con los datos
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Products> allListProducts() {
		/*Creamos una session ya que vamos a usar el proveedor de hibernate 
		y luego invocamos el manager*/
		Session currentSession = entityManager.unwrap(Session.class);
		/*Creamos una query invocamos la sesion para  poder crear
		 * y indicar el nombre de la consulta y luego indicamos el modelo*/
		Query<Products> query = currentSession.createNamedQuery("from tblproducts",Products.class);
		/*Creamos una lista de productos y luego obtenemos los resultados de la lista*/
		List<Products> listProducts = query.getResultList();
		return listProducts; //devolvemos la lista de productos
	}

	@Override
	public int createProduct(Products model) {
		
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
