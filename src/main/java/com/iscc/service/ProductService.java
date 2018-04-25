package com.iscc.service;

import java.util.List;

import com.iscc.pojo.Product;

public interface ProductService {
	public List<Product> list();
	public void add(Product p);
	public Product showone(int id);
	public void update(Product p);
	public void delete(Product p);
}
