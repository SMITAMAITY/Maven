package com.lti.service;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Customer;
import com.lti.dao.CustomerDao;
import com.lti.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao dao;
	
	public CustomerServiceImpl() throws SQLException 
	{
		dao =  new CustomerDaoImpl();
	}
	@Override
	public List<Customer> insert(Customer c) 
	{
	List<Customer> myList = null;
	
		myList=dao.insert(c);
		
		return myList;
				
	}
	@Override
	public List<Customer> GetAllCustomerDetails() 
	{
		
		return dao.GetAllCustomerDetails();
				
	}
	@Override
	public int deleteitem(int cId) throws SQLException {
		System.out.println(dao.deleteitem(cId));
		return cId;
	}



//	@Override
//	public List<Customer> getAllCustomers() throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}


}


