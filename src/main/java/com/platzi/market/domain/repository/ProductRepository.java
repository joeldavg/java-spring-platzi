package com.platzi.market.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.market.domain.Product;

public interface ProductRepository {

	public List<Product> getAll();
	
	public Optional<List<Product>> getByCategory(int categoryId);
	
	public Optional<List<Product>> getScarseProducts(int quantity);
	
	public Optional<Product> getProduct(int productId);
	
	public Product save(Product product);
	
	public void delete(int productId);
	
}
