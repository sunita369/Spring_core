package trial;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import trial.Address;
import trial.Customer;

public class MyTest {
	Customer c1 = new Customer(003,"Sunita",95716482,new Address("Kolkata","Mathkol","West Bengal",700065,"India"));
	Customer c2 = null;
	

	@Test
	public void testCustomer1() {
	System.out.println("Test case 1");
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Customer customer =(Customer)context.getBean("obj");
    assertNotNull(customer);
	}
	@Test
	public void testCustomer() {
		System.out.println("Test case 2");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Customer customer =(Customer)context.getBean("obj");
		
		assertEquals(c1.getCustomerId(),customer.getCustomerId());
		
		assertEquals(c1.getCustomerName(),customer.getCustomerName());
		
		assertEquals(c1.getCustomerContact(),customer.getCustomerContact());
		
		assertEquals(c1.getCustomerAddress().getStreet(),customer.getCustomerAddress().getStreet());
		
		assertEquals(c1.getCustomerAddress().getCity(),customer.getCustomerAddress().getCity());
		
		assertEquals(c1.getCustomerAddress().getState(),customer.getCustomerAddress().getState());
		
		assertEquals(c1.getCustomerAddress().getZip(),customer.getCustomerAddress().getZip());
		
		assertEquals(c1.getCustomerAddress().getCountry(),customer.getCustomerAddress().getCountry());
		
		
		
	}

}

