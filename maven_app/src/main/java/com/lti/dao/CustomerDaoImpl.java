package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Customer;
import com.lti.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao {
DbUtil util = new DbUtil();


	
	Connection conn=null;
		@Override
		public List<Customer> GetAllCustomerDetails() {
			List<Customer> myList=null;			
			try
			{		
				myList= new ArrayList<>();			
				conn= util.getDataSource();
				Statement stmt= conn.createStatement();			
				ResultSet rs= stmt.executeQuery("Select * from Customer_Detail");			
				while(rs.next())
				{
					int cId = rs.getInt(1);
					String cName=rs.getString(2);
					double balance = rs.getDouble(3);
				
					Customer stu=new Customer(cId,cName,balance);
					myList.add(stu);		
				}
				
			}
				 catch (SQLException e) {
						// TODO Auto-generated catch block
				e.printStackTrace();
				 }
			return myList;
				
			}
			
		public int deleteitem(int cId) throws SQLException {
			conn= util.getDataSource();
			PreparedStatement pst= conn.prepareStatement("Delete From Customer_Detail Where CID=?");
			pst.setInt(1,  cId);
			int count = pst.executeUpdate();
			
			return count;
		}
	public List<Customer> insert(Customer c) 
	{
			  String SQL_INSERT ="INSERT INTO Customer_Detail (CID, CName, Balance) VALUES (?,?,?)";	
		List<Customer> myList=null;			
		try
		{		
			myList= new ArrayList<>();			
			conn= util.getDataSource();
			
			
			PreparedStatement ps= conn.prepareStatement(SQL_INSERT);
			
			//ps.setInt(1, 1000);
			ps.setInt(1,(c.getcId()));
			ps.setString(2,(c.getcName()));
			ps.setDouble(3,(c.getBalance()));
		
			ps.executeQuery();
			
			Customer cust= new Customer(c.getcId(),c.getcName(),c.getBalance());
			myList.add(cust);		
			
			return myList;	
			
		} catch (SQLException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(conn!=null)
				{
				conn.close();
				}
				
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return myList;	
	}

	
}

