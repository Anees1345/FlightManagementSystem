package com.mycompany.flightmanagementsystem.model;

public class Flight {

    private int flightId;
    private String flightCode;
    private String source;
    private String destination;
    private String departureTime;
    private double price;
    private int seats;

    public Flight() {
    }

    public Flight(int flightId, String flightCode, String source, String destination,
                  String departureTime, double price, int seats) {
        this.flightId = flightId;
        this.flightCode = flightCode;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.price = price;
        this.seats = seats;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
