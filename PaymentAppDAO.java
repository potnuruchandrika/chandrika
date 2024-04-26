package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PaymentAppDAO {
	public void insert(user u)
	{
		try {

			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/payments","root","root");
				 Statement stmt = con.createStatement();
				String query = "insert into PAYMENTAPP(firstname,lastname,email,phonenumber,createpassword)values('"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getEmail()+"','"+u.getPhoneNumber()+"','"+u.getPassword()+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}

	

}
