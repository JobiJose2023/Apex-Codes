package com.apex.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@jakarta.servlet.annotation.WebServlet("/submit")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");

        // Print form data to console (you can modify this part as needed)
        System.out.println("Form Submission Result:");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Gender: " + gender);

        // You can perform additional processing here as needed

        // Redirect to a thank you page or any other page
        
        String redirectURL = "thankYou.jsp?name=" + name + "&phone=" + phone + "&gender=" + gender;
        response.sendRedirect(redirectURL);
    }
}
