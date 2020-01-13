package com.lti.service;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Customer;

public interface CustomerService {
	
	public List<Customer> insert(Customer cust) throws SQLException;
	public int deleteitem(int cId) throws SQLException;
	List<Customer> GetAllCustomerDetails() throws SQLException;
	
	

}
