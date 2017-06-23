package com.samples.dao.hibernate.samples;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.samples.dao.hibernate.domain.Product;

public class HibernateCallBackExample extends HibernateDaoSupport implements ProductDAO {
	
	public List<Product> loadProductsByCategory(final String category) throws DataAccessException {
		return (List<Product>)  this.getHibernateTemplate().execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				// TODO Auto-generated method stub
		
				Criteria criteria = session.createCriteria(Product.class);
				criteria.add(Expression.eq("category", category));
				criteria.setMaxResults(6);
				return criteria.list();
			} 
		});		
	}	
}
