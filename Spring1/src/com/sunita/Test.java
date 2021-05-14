package com.sunita;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Customer customer =(Customer)context.getBean("obj");
		customer.displayInfo();
	}
}
