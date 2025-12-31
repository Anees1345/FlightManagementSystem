<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bookings</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-4">
    <h3>Flight Booking</h3>

    <form action="BookingServlet" method="post" class="row g-3">
        <div class="col-md-6">
            <input type="number" name="customerId" class="form-control" placeholder="Customer ID">
        </div>
        <div class="col-md-6">
            <input type="number" name="flightId" class="form-control" placeholder="Flight ID">
        </div>
        <div class="col-md-12">
            <button class="btn btn-warning">Book Flight</button>
        </div>
    </form>

    <hr>

    <table class="table table-bordered">
        <thead class="table-dark">
            <tr>
                <th>Booking ID</th><th>Customer</th><th>Flight</th><th>Status</th>
            </tr>
        </thead>
        <tbody>
            <!-- Booking list -->
        </tbody>
    </table>
</div>

</body>
</html>
