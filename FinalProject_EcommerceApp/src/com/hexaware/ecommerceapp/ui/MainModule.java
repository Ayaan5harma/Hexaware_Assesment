package com.hexaware.ecommerceapp.ui;

import java.util.Scanner;


import com.hexaware.ecommerceapp.entity.Customer;
import com.hexaware.ecommerceapp.exception.CustomerNotFoundException;
import com.hexaware.ecommerceapp.exception.OrderNotFoundException;
import com.hexaware.ecommerceapp.exception.ProductNotFoundException;
import com.hexaware.ecommerceapp.service.IEcommerceService;
import com.hexaware.ecommerceapp.service.EcommerceServiceImp;

/**
 * Main class for the E-commerce application.
 * 
 * Provides a command-line interface for users to interact with the application.
 * 
 *
 * @Date 20/10/24
 */
public class MainModule {
	public static void main(String [] args) {

		IEcommerceService eser = new EcommerceServiceImp();
		
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. register customer");
            System.out.println("2. create product");
            System.out.println("3. delete product");
            System.out.println("4. Add to cart");
            System.out.println("5. view cart");
            System.out.println("6. place order");
            System.out.println("7. view customer order");
            System.out.println("8. exit");
            System.out.println("Enter your choice");

            int ch = sc.nextInt();
            if(ch==8)
            {
            	System.out.println("Thankyou for Shopping....");
            	break;
            }
            else if(ch==1) {
            	
            	eser.createCustomer();
            	
            	
            }
            else if(ch==2) {
          
            	eser.createProduct();
            }
            else if(ch==3) {
            	try {
				
            		eser.deleteProduct();
				} catch (ProductNotFoundException e) {
					System.out.println(e.getMessage());
				}
            	
            }
            else if(ch==4) {
            	
            	eser.addToCart();
            }
            else if(ch==5) {
				
				eser.getAllFromCart();
            }
            else if(ch==6) {
            	
            	eser.placeOrder();
            }
            else if(ch==7) {
            	try {
					
					eser.getOrdersByCustomer();
				} catch (CustomerNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (OrderNotFoundException e) {
					System.out.println(e.getMessage());
				}
            }
            else {
            	break;
            }
        }

		sc.close();
		
	}
}
