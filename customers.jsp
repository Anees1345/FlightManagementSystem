<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-4">
    <h3>Customer Management</h3>

    <form action="CustomerServlet" method="post" class="row g-3">
        <div class="col-md-6">
            <input type="text" name="name" class="form-control" placeholder="Customer Name" required>
        </div>
        <div class="col-md-6">
            <input type="text" name="phone" class="form-control" placeholder="Phone" required>
        </div>
        <div class="col-md-6">
            <input type="email" name="email" class="form-control" placeholder="Email">
        </div>
        <div class="col-md-6">
            <input type="text" name="nationality" class="form-control" placeholder="Nationality">
        </div>
        <div class="col-md-12">
            <button class="btn btn-primary">Add Customer</button>
        </div>
    </form>

    <hr>

    <table class="table table-bordered mt-3">
        <thead class="table-dark">
            <tr>
                <th>ID</th><th>Name</th><th>Phone</th><th>Email</th><th>Nationality</th>
            </tr>
        </thead>
        <tbody>
            <!-- Data comes from servlet -->
        </tbody>
    </table>
</div>

</body>
</html>
