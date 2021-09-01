package com.servlet;

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


@WebServlet("/CompanyInfo")
public class CompanyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
	String cName = request.getParameter("companyinfo");
	String cEmail = request.getParameter("email");
	
	try
	{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shailesh","root","root");
		 
		 PreparedStatement ps=con.prepareStatement("insert into Companyinfo values(?,?)");
		 ps.setString(1, cName);
		 ps.setString(2, cEmail);
		 int i =ps.executeUpdate();
		
		if(i > 0)
		 {
			out.println("inserted");
		 }
		/**
		 Statement st = (Statement) con.createStatement();
		 ResultSet rs = ((java.sql.Statement) st).executeQuery("select * from Companyinfo");
		 while (rs.next()) {
			 out.print("<tr><td>");
			 out.println(rs.getString(1));
			 out.print("</td>");
			 out.print("<td>");
			 out.println(rs.getString(2));
			 out.print("</td>");
			 out.print("<td>");
		 } */
		
	} 
		 catch (Exception e)
		 {
			 e.printStackTrace();
			
		 }
	
		 
	}


}
