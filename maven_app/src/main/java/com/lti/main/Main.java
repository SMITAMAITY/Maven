package com.lti.main;

import java.sql.SQLException;

import com.lti.bean.Customer;
import com.lti.service.CustomerService;
import com.lti.service.CustomerServiceImpl;

import java.util.*;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		List<Customer> pList = new ArrayList<Customer>();
		Scanner s = new Scanner(System.in);
		CustomerService cs= new CustomerServiceImpl();
		System.out.println("Enter choices: 1. FOR INSERTING CUSTOMER DETAILS  2. FOR DISPLAYING CUSTOMER DETAILS  3. FOR DELETING CUSTOMERS");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			
			Customer cust = new Customer(100,"smita",5000);
			cs.insert(cust);
		break;
		case 2:
			pList = cs.GetAllCustomerDetails();
			for (Customer customer : pList) {
				System.out.println(customer);
			}
		break;
		case 3:
			int id=s.nextInt();
			cs.deleteitem(id);
		break;
		default:
			System.out.println("Invalid Data");
		break;
			
			
		}
	}

}
