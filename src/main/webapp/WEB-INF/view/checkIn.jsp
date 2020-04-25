<%--
  Created by IntelliJ IDEA.
  User: Vinod
  Date: 4/25/2020
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Check In</title>
    <link type="text/css" rel="stylesheet" href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css"/>
    <meta name="viewport" content="width=device-width , initial-scale=1.0">
</head>
<body>
<div class="container-fluid">
    <form action="${pageContext.request.contextPath}/reservationDetails">
        <div class="form-group">
            <label>Enter Reservation Id</label>
            <input type="number" name="id" min="0" required class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<div class="alert-danger">
    ${msg}
</div>
</body>
</html>
