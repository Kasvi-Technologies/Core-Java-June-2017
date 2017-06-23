package com.samples.dao.hibernate.samples;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.samples.dao.hibernate.domain.Product;

public class ProductManagerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProductManager productManager = (ProductManager) context.getBean("productManager");
		
		System.out.println("Save the product");
		Product p = new Product() ;
		p.setCategory("soap");
		p.setProductName("cinthol");
		
		productManager.saveProduct(p);
		
		System.out.println("Load all products of soap Category");
		
		List<Product> products =  productManager.getProducotByCategory("soap");
		System.out.println("Products Size: " + products.size());
		
		for (Product product: products ) {
			System.out.println(product);
		}
		
		Product product = productManager.findProductbyId(4);
		
		System.out.println("Deleting the product of id 4 ");
		productManager.deleteProduct(product);
		
		System.out.println("After deletion of Product 4 ");
		
		products =  productManager.loadProductss();
		
		System.out.println("Products Size: " + products.size());
		
		Iterator it = null;
		
		for (Product product1: products ) {
			System.out.println(product1);
		}
		
		
		
		
	}

}
