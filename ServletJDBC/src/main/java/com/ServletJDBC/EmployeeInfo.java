package com.ServletJDBC;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeInfo")
public class EmployeeInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String department = request.getParameter("department");
	
	try
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shailesh","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		 ps.setString(1, id);
		 ps.setString(2, name);
		 ps.setString(2, department);
		 int i =ps.executeUpdate();
		
		if(i > 0)
		 {
			out.println("Record Inserted Sucessfully");
		 }
		
	} 
		 catch (Exception e)
		 {
			 e.printStackTrace();
			
		 }
	
		 
	}


}
