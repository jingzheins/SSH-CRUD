package com.iscc.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.iscc.dao.ProductDAO;
import com.iscc.pojo.Product;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO{

	public List<Product> list() {
		// TODO Auto-generated method stub
		return find("from Product");
	}

	public void add(Product p) {
		// TODO Auto-generated method stub
		save(p);
	}

	public void del(Product p) {
		// TODO Auto-generated method stub
		super.delete(p);
		
	}

	public Product showone(int id) {
		// TODO Auto-generated method stub
		return (Product) get(Product.class, id);
	}

	public void update(Product p) {
		// TODO Auto-generated method stub
		super.update(p);
	}

}
