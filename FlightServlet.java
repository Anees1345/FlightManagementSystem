package com.mycompany.flightmanagementsystem.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FlightServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String code = request.getParameter("code");
            String source = request.getParameter("source");
            String destination = request.getParameter("destination");
            String price = request.getParameter("price");
            
            // Later: Save using DAO
            System.out.println("Flight Added: " + code);
            
            response.sendRedirect("flights.jsp");
        } catch (java.io.IOException ex) {
            Logger.getLogger(FlightServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Handles flight operations";
    }
}
