package com.lti.dao;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Customer;

public interface CustomerDao {
	public List<Customer> insert(Customer c);

	
	public int deleteitem(int cId) throws SQLException;

	List<Customer> GetAllCustomerDetails();


}
