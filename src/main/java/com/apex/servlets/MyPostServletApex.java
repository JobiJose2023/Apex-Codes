package com.apex.servlets;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
public class MyPostServletApex extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MyPostServletApex() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String val1 = request.getParameter("val1");
        String val2 = request.getParameter("val2");
        try {
            if (val1 != null && !val1.isEmpty() && val2 != null && !val2.isEmpty()) {
                // Corrected parsing to use the actual values obtained from request parameters
                int intval1 = Integer.parseInt(val1);
                int intval2 = Integer.parseInt(val2);

                // Perform operations with the parsed values
                int result = intval1 * intval2;

                // Send the result as a response
                response.getWriter().write("Result: " + result);
                response.getWriter().append("     ");                
                response.getWriter().append(" The product of the 2 numbers is: " + result);
            } else {
                // Handle the case where one or both values are null or empty
                response.getWriter().write("Error: One or both values are missing or empty.");
            }
        } catch (NumberFormatException e) {
            // Handle the case where parsing fails
            response.getWriter().write("Error: Invalid number format. Please provide valid integers.");
        }
    }
}
