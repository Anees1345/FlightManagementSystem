package com.mycompany.flightmanagementsystem.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BookingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int flightId = Integer.parseInt(request.getParameter("flightId"));

        // Later: Save booking using DAO
        System.out.println("Booking Created: Customer " + customerId + ", Flight " + flightId);

        response.sendRedirect("tickets.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Handles flight bookings";
    }
}
