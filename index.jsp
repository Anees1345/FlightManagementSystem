<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flight Management System</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #003366;
            color: white;
            padding: 15px;
            text-align: center;
        }
        nav {
            background-color: #00509e;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: white;
            margin: 0 15px;
            text-decoration: none;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .container {
            padding: 40px;
            text-align: center;
        }
        .card {
            display: inline-block;
            background: white;
            padding: 20px;
            margin: 15px;
            width: 220px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            border-radius: 8px;
        }
        footer {
            background-color: #003366;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>

<header>
    <h1>Flight Management System</h1>
    <p>Welcome to Airline Operations Dashboard</p>
</header>

<nav>
    <a href="login">Login</a>
    <a href="flights">Flights</a>
    <a href="customers">Customers</a>
    <a href="bookings">Bookings</a>
    <a href="tickets">Tickets</a>
</nav>

<div class="container">

    <div class="card">
        <h3>Flights</h3>
        <p>Manage flight schedules and routes</p>
    </div>

    <div class="card">
        <h3>Customers</h3>
        <p>View and manage passengers</p>
    </div>

    <div class="card">
        <h3>Bookings</h3>
        <p>Handle flight reservations</p>
    </div>

    <div class="card">
        <h3>Tickets</h3>
        <p>Generate and manage tickets</p>
    </div>

</div>

<footer>
    © 2025 Flight Management System | Developed for Academic Project
</footer>

</body>
</html>

