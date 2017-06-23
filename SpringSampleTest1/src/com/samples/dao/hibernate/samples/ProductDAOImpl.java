package com.samples.dao.hibernate.samples;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.samples.dao.hibernate.domain.Product;

public class ProductDAOImpl implements ProductDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
		
	public List<Product> loadProductsByCategory(String category) throws DataAccessException {
		return this.hibernateTemplate.find("from Product product where product.category= ? ", category);
	}
	
}
