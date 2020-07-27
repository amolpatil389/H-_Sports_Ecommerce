package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("name");
		String htmlResponse = "<html><h3>Welcome to Servlets</h3></html>";
		PrintWriter writer= response.getWriter();
		writer.write(htmlResponse+" "+value);
		
		
		
	}
}

	
