package com.samples.dao.hibernate.samples;

import java.util.List;
import org.hibernate.SessionFactory;
import com.samples.dao.hibernate.domain.Product;

public class ProductDAOImpl2 implements ProductDAO {
		
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Product> loadProductsByCategory(String category) {
		return this.sessionFactory.getCurrentSession()
			.createQuery("from Product product where product.category = ?")
			.setParameter(0, category)
			.list();
	}
	
}
