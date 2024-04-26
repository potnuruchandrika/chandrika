package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registrationservlet")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname=request.getParameter("First Name");
		String lastname=request.getParameter("Last Name");
		String createpassword=request.getParameter("Create Password");
		String phonenumber=request.getParameter("Phone Number");
		String email=request.getParameter("Email");
		System.out.println(lastname);
		response.getWriter().write(firstname);
		System.out.println("Done");
		user u=new user();
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setPhoneNumber(phonenumber);
		u.setEmail(email);
		u.setPassword(createpassword);
		PaymentAppDAO pd = new PaymentAppDAO();
		pd.insert(u);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
