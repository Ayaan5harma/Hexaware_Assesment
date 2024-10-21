package com.hexaware.ecommerceapp.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.hexaware.ecommerceapp.dao.OrderProcessorRepositoryImpl;
import com.hexaware.ecommerceapp.entity.Customer;
import com.hexaware.ecommerceapp.entity.Product;
import com.hexaware.ecommerceapp.exception.CustomerNotFoundException;
import com.hexaware.ecommerceapp.exception.ProductNotFoundException;

/**
 * Test class for E-commerce service implementation.
 * 
 * Provides test cases for product management, cart operations, order placement, and exception handling.
 * 
 * 
 * Date : 20/10/24
 * 
 */

class EcommerceServiceImplTest {

	@Test
	void createProductTest() {
		Product p = new Product();
		p.setName("Omega 3d");
		p.setDescription("vr tech");
		p.setProduct_id(601);
		p.setPrice(5060.0);
		p.setStockQuantity(7);
		
		OrderProcessorRepositoryImpl o = new OrderProcessorRepositoryImpl();
		boolean isCreated = o.createProduct(p);
		
		assertTrue(isCreated);
		
	}
	
	@Test
	void createCartTest() {
		Product p = new Product();
		p.setName("Omega");
		p.setDescription("desc");
		p.setProduct_id(200);
		p.setPrice(500.0);
		p.setStockQuantity(10);
		
		Customer c = new Customer();
		c.setCustomer_id(999);
		c.setEmail("himan@gmail.com");
		c.setName("Himan");
		c.setPassword("HSharma123");
		
		
		OrderProcessorRepositoryImpl o = new OrderProcessorRepositoryImpl();
		boolean isCreated = o.addToCart(c, p, 1);
		
		assertTrue(isCreated);
	}
		
	@Test
	void placeOrderTest() {
		 int customer_id = 107;		
		 String shippingAddress = "Singapore";
		 
		 OrderProcessorRepositoryImpl opri = new OrderProcessorRepositoryImpl();
		 Customer c = opri.getCustomerById(customer_id);
		 List<Map<Product,Integer>> productQuantityMap =  opri.getProductQuantityFromCart(c);
		 
		 boolean isOrderPlaced = opri.placeOrder(c, productQuantityMap, shippingAddress);
		 
		 assertTrue(isOrderPlaced);
	}
	
	@Test
	void checkExceptionForProduct() {
		int productId = 1000;
		OrderProcessorRepositoryImpl opri = new OrderProcessorRepositoryImpl();
		try {
			boolean isDeleted=opri.deleteProduct(productId);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void checkExceptionForCustomer() {
		int customerId = 1000;
		OrderProcessorRepositoryImpl opri = new OrderProcessorRepositoryImpl();
		try {
			boolean isDeleted=opri.deleteCustomer(customerId);
			System.out.println(isDeleted);
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
