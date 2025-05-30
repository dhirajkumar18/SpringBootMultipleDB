package com.dhiraj.multiple.dbconnection.postgresql.entity;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    public Product() {
    super();
    }
	public Product(Long id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + "]";
	}
    
}
