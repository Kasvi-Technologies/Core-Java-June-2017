package com.samples.dao.hibernate.samples;

import java.util.List;
import org.springframework.dao.DataAccessException;
import com.samples.dao.hibernate.domain.Product;

public interface ProductDAO {
	public List<Product> loadProductsByCategory(String category) throws DataAccessException;
}
