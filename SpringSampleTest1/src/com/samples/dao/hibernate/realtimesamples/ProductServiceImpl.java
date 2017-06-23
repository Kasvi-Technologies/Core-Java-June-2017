package com.samples.dao.hibernate.realtimesamples;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.samples.dao.hibernate.domain.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;
	
	public void setProductDAO (ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	public void deleteProduct(Product product) throws DataAccessException {
		// TODO Auto-generated method stub
		this.productDAO.deleteProduct(product);
		
	}

	public List getProducotByCategory(String category) throws DataAccessException {
		// TODO Auto-generated method stub
		return this.productDAO.getProducotByCategory (category);
	}

	public List loadProductss() throws DataAccessException {
		// TODO Auto-generated method stub
		return productDAO.loadProductss();
	}

	public void saveProduct(Product product) throws DataAccessException {
		// TODO Auto-generated method stub
		this.productDAO.saveProduct(product);
		
	}
	
	public Product findProductbyId(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return (Product) this.productDAO.findProductbyId(id);		
	}
	
}
