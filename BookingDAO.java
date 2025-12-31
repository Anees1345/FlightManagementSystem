package com.mycompany.flightmanagementsystem.dao;

import com.mycompany.flightmanagementsystem.model.Booking;
import com.mycompany.flightmanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    public void addBooking(Booking b) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO bookings(customer_id, flight_id, booking_date, status) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, b.getCustomerId());
            ps.setInt(2, b.getFlightId());
            ps.setString(3, b.getBookingDate());
            ps.setString(4, b.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelBooking(int bookingId) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE bookings SET status='CANCELLED' WHERE booking_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bookingId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Booking> getAllBookings() {
        List<Booking> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM bookings";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Booking b = new Booking();
                b.setBookingId(rs.getInt("booking_id"));
                b.setCustomerId(rs.getInt("customer_id"));
                b.setFlightId(rs.getInt("flight_id"));
                b.setBookingDate(rs.getString("booking_date"));
                b.setStatus(rs.getString("status"));
                list.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
