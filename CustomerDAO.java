package com.mycompany.flightmanagementsystem.dao;

import com.mycompany.flightmanagementsystem.model.Customer;
import com.mycompany.flightmanagementsystem.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public void addCustomer(Customer c) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO customers(name, phone, email, nationality) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getNationality());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Customer> getAllCustomers() {
        List<Customer> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM customers";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Customer c = new Customer();
                c.setCustomerId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                c.setNationality(rs.getString("nationality"));
                list.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
