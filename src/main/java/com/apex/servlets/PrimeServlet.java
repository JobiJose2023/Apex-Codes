package com.apex.servlets;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet
public class PrimeServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving the parameters from the HTML form
        
        int startNumber = Integer.parseInt(request.getParameter("startNumber"));
        int endNumber = Integer.parseInt(request.getParameter("endNumber"));
                
        out.println("<html><body>");
        out.println("<h2>Prime Numbers between " + startNumber + " and " + endNumber + ":</h2>");
        out.println("<ul>");

        for (int i = startNumber; i <= endNumber; i++) {
            if (isPrime(i)) {
                out.println("<li>" + i + "</li>");
            }
        }
        out.println("<h1>Jobi Jose</h1>");
        out.println("</ul>");
        out.println("</body></html>");
    }

    // Function to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}