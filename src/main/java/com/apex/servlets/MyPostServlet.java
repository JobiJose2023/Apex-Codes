package com.apex.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet
public class MyPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MyPostServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Hi Jobi this is your MyPostServelet ");
		
	}

}