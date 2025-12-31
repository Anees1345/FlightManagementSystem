package com.mycompany.flightmanagementsystem.controller;

/*import jakarta.io.IOException;*/
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CancelServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int bookingId = Integer.parseInt(request.getParameter("bookingId"));

        // Later: Update booking status to CANCELLED
        System.out.println("Booking Cancelled: " + bookingId);

        response.sendRedirect("bookings.jsp");
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
        return "Handles booking cancellation";
    }
}
