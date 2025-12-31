package com.mycompany.flightmanagementsystem.model;

public class Booking {

    private int bookingId;
    private int customerId;
    private int flightId;
    private String bookingDate;
    private String status;

    public Booking() {
    }

    public Booking(int bookingId, int customerId, int flightId,
                   String bookingDate, String status) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.flightId = flightId;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
