package com.mycompany.flightmanagementsystem.model;

public class Ticket {

    private int ticketId;
    private int bookingId;
    private String seatNumber;
    private String issueDate;

    public Ticket() {
    }

    public Ticket(int ticketId, int bookingId,
                  String seatNumber, String issueDate) {
        this.ticketId = ticketId;
        this.bookingId = bookingId;
        this.seatNumber = seatNumber;
        this.issueDate = issueDate;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}
