package paymentapp.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PaymentappDAO {
	public void insert(User u)
	{
		try {

			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/payments","root","root");
				 Statement stmt = con.createStatement();
				String query = "insert into paymentapp(username,password)values('"+u.getUserName()+"','"+u.getPassword()+"')";
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

