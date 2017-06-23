package com.samples.dao.hibernate.realtimesamples;

import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.samples.dao.hibernate.domain.Product;

public class ProductServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProductService productService = (ProductService) context.getBean("productServiceProxy");
		
		System.out.println("Save the product");
		Product p = new Product() ;
		p.setCategory("soap");
		p.setProductName("cinthol");
		
		productService.saveProduct(p);
		
		System.out.println("Load all products of soap Category");
		
		List<Product> products =  productService.getProducotByCategory("soap");
		System.out.println("Products Size: " + products.size());
		
		for (Product product: products ) {
			System.out.println(product);
		}
		
//		Product product = productService.findProductbyId(5);
//		System.out.println("Deleting the product of id 2 ");
//		if(product != null )
//		productService.deleteProduct(product);
//		
//		System.out.println("After deletion of Product 2 ");
//		
//		products =  productService.loadProductss();
//		
//		System.out.println("Products Size: " + products.size());
//		
//		Iterator it = null;
//		
//		for (Product product1: products ) {
//			System.out.println(product1);
//		}
		
		
		
		
	}

}
