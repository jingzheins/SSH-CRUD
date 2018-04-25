package com.iscc.dao;

import java.util.List;

import com.iscc.pojo.Product;

public interface ProductDAO {
	public List<Product> list();

	public void add(Product p);
	
	public void del(Product p);
	
	public Product showone(int id);
	
	public void update(Product p);

}
