package com.ust1.spring.springcore.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust1.spring.springcore.map.Customer;


public class Test {
	public static void main(String[] args)
	{
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/ust1/spring/springcore/exercise/config.xml");
	Employee cd1=(Employee) ac.getBean("y");
	Employee cd2=(Employee) ac.getBean("x");
	System.out.println(cd1);
	System.out.println(cd2);
	}
}
