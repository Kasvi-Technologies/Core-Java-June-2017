package com.samples.dao.hibernate.samples;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.samples.dao.hibernate.domain.Product;

public class ProductDAOImpl1 extends HibernateDaoSupport implements ProductDAO {
		
	public List<Product> loadProductsByCategory(String category) throws DataAccessException {
		return this.getHibernateTemplate().find("from Product product where product.category= ? ", category);
	}
	
}
