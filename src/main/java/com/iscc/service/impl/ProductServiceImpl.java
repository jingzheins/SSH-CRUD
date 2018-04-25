package com.iscc.service.impl;

import java.util.List;

import com.iscc.dao.ProductDAO;
import com.iscc.pojo.Product;
import com.iscc.service.ProductService;

public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;
	
	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<Product> list() {
		// TODO Auto-generated method stub
		return productDAO.list();
	}

	public void add(Product p) {
		productDAO.add(p);
	}

	public Product showone(int id) {
		// TODO Auto-generated method stub
		return productDAO.showone(id);
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		productDAO.update(p);
	}

	public void delete(Product p) {
		// TODO Auto-generated method stub
		productDAO.del(p);
	}
	

}
