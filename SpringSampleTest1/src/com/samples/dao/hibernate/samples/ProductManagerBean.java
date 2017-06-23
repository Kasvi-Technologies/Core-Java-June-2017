package com.samples.dao.hibernate.samples;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.samples.dao.hibernate.domain.Product;

public class ProductManagerBean extends HibernateDaoSupport implements ProductManager {

	public void deleteProduct(Product product) throws DataAccessException {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(product);
		
	}

	public List getProducotByCategory(String category) throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Product product where product.category=?", category);
	}

	public List loadProductss() throws DataAccessException {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().loadAll(Product.class);
	}

	public void saveProduct(Product product) throws DataAccessException {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(product);
		
	}
	
	public Product findProductbyId(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		return (Product) this.getHibernateTemplate().load(Product.class, id);
		
	}
	
}
