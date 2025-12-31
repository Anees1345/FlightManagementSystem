<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <span class="navbar-brand">Flight Management System</span>
        <a href="index.jsp" class="btn btn-danger btn-sm">Logout</a>
    </div>
</nav>

<div class="container mt-4">
    <h3 class="mb-4">Dashboard</h3>

    <div class="row g-3">
        <div class="col-md-3">
            <a href="customers.jsp" class="btn btn-primary w-100">Customers</a>
        </div>
        <div class="col-md-3">
            <a href="flights.jsp" class="btn btn-success w-100">Flights</a>
        </div>
        <div class="col-md-3">
            <a href="bookings.jsp" class="btn btn-warning w-100">Bookings</a>
        </div>
        <div class="col-md-3">
            <a href="tickets.jsp" class="btn btn-info w-100">Tickets</a>
        </div>
    </div>
</div>

</body>
</html>
