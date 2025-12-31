<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Flights</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-4">
    <h3>Flight Management</h3>

    <form action="FlightServlet" method="post" class="row g-3">
        <div class="col-md-3">
            <input type="text" name="code" class="form-control" placeholder="Flight Code">
        </div>
        <div class="col-md-3">
            <input type="text" name="source" class="form-control" placeholder="Source">
        </div>
        <div class="col-md-3">
            <input type="text" name="destination" class="form-control" placeholder="Destination">
        </div>
        <div class="col-md-3">
            <input type="number" name="price" class="form-control" placeholder="Price">
        </div>
        <div class="col-md-12">
            <button class="btn btn-success">Add Flight</button>
        </div>
    </form>

    <hr>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>ID</th><th>Code</th><th>Source</th><th>Destination</th><th>Price</th>
            </tr>
        </thead>
        <tbody>
            <!-- Data from FlightServlet -->
        </tbody>
    </table>
</div>

</body>
</html>
