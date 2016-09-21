package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub\
		PrintWriter out = response.getWriter();
		out.print("<font color ='red' size='16'> Hello  Servlet </font>");
		Date today = new Date();
		out.print(today);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String prin= request.getParameter("p");
		String time= request.getParameter("t");
		String rate= request.getParameter("r");
		out.print(" YOU ARE ON SERVLET      <br>");
		out.print(prin);
		out.print("<br>");
		out.print(time);
		out.print("<br>");
		out.print(rate);
		out.print("<br>");
		
		int pr = Integer.parseInt(prin);
		int ti = Integer.parseInt(time);
		int ra = Integer.parseInt(rate);
		
		int total =(pr*ti*ra)/100;
		
		out.print("SI  is  "+total);
		
		
		//doGet(request, response);
	}

}
