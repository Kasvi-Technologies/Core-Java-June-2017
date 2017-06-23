package com.samples.dao.hibernate.realtimesamples;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.samples.dao.hibernate.domain.Product;

public interface ProductDAO {
	
	public List loadProductss() throws DataAccessException ;
	public void saveProduct(Product product) throws DataAccessException ;
	public void deleteProduct(Product product) throws DataAccessException;
	public List getProducotByCategory(String category) throws DataAccessException ;
	public Product findProductbyId(int id) throws DataAccessException ;
	
	
}
