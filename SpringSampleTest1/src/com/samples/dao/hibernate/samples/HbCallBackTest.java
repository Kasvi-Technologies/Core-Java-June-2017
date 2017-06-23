package com.samples.dao.hibernate.samples;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.samples.dao.hibernate.domain.Product;

public class HbCallBackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HibernateCallBackExample hibernateCallBackExample = (HibernateCallBackExample) context.getBean("hibernateCallBackExample");
		
		List<Product> products = hibernateCallBackExample.loadProductsByCategory("soap");
		System.out.println("Products Size: " + products.size());
		
		for (Product product: products ) {
			System.out.println(product);
		}
		
	}

}
