package com.ust1.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust1.spring.springorm.product.dao.ProductDao;
import com.ust1.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ust1/spring/springorm/product/test/config.xml");
		ProductDao pd = (ProductDao) ac.getBean("productDao");
	    Product product = new Product();
		//product.setId(2);
		//product.setName("Samsung");
		//product.setDesc("Nice phone");
		//product.setPrice(15000);
		
	   // pd.create(product);
	    //System.out.println(product);
		//pd.update(product);
		//pd.delete(product);
		
		//Product prod=pd.find(1);
		//System.out.println(prod);
		
		List<Product> findall = pd.findall();
		System.out.println(findall);
	}

}
