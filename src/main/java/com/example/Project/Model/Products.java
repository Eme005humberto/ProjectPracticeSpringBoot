package com.example.Project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_product;
	
	@Column(name = "nameProduct")
	private String nameProduct;
	
	@Column(name = "unitPrice")
	private float unitprice;
	
	@Column(name = "category")
	private String category;
	
	public Products() {
		super();
	}
	
	public Products(int id_product, String nameProduct, float unitprice, String category) {
		super();
		this.id_product = id_product;
		this.nameProduct = nameProduct;
		this.unitprice = unitprice;
		this.category = category;
	}

	//Getters and Setters
	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
}
