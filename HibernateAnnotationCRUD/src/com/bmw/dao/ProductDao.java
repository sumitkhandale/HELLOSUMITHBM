package com.bmw.dao;

import java.util.List;

import com.bmw.model.Product;



public interface ProductDao {
	
	public List<Product> getAllProductData();
	
	public Product getProductDataById(int productId);
	
	public void saveProductData(Product product);
	
	public void saveBulkProductData(List<Product> products);
	
	public void updateProductData(int productId,Product product);
	
	public void deleteProductDataById(int productId);
	
	public void deleteAllProductData();
	

}
