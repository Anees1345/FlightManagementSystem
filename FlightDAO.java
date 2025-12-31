package com.mycompany.flightmanagementsystem.dao;

import com.mycompany.flightmanagementsystem.model.Flight;
import com.mycompany.flightmanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public void addFlight(Flight f) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO flights(flight_code, source, destination, departure_time, price, seats) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.getFlightCode());
            ps.setString(2, f.getSource());
            ps.setString(3, f.getDestination());
            ps.setString(4, f.getDepartureTime());
            ps.setDouble(5, f.getPrice());
            ps.setInt(6, f.getSeats());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Flight> getAllFlights() {
        List<Flight> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM flights";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Flight f = new Flight();
                f.setFlightId(rs.getInt("flight_id"));
                f.setFlightCode(rs.getString("flight_code"));
                f.setSource(rs.getString("source"));
                f.setDestination(rs.getString("destination"));
                f.setDepartureTime(rs.getString("departure_time"));
                f.setPrice(rs.getDouble("price"));
                f.setSeats(rs.getInt("seats"));
                list.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
