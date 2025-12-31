package com.mycompany.flightmanagementsystem.dao;

import com.mycompany.flightmanagementsystem.model.Ticket;
import com.mycompany.flightmanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO {

    public void addTicket(Ticket t) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO tickets(booking_id, seat_number, issue_date) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getBookingId());
            ps.setString(2, t.getSeatNumber());
            ps.setString(3, t.getIssueDate());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Ticket> getAllTickets() {
        List<Ticket> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM tickets";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ticket t = new Ticket();
                t.setTicketId(rs.getInt("ticket_id"));
                t.setBookingId(rs.getInt("booking_id"));
                t.setSeatNumber(rs.getString("seat_number"));
                t.setIssueDate(rs.getString("issue_date"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
