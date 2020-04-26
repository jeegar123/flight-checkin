<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Vinod
  Date: 4/25/2020
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Checkin page</title>
    <link type="text/css" rel="stylesheet" href="webjars/bootstrap/4.4.1-1/css/bootstrap.min.css"/>
    <meta name="viewport" content="width=device-width , initial-scale=1.0">
</head>
<body>
<div class="container-fluid w-auto d-flex justify-content-center">
    <table class="table-bordered w-50 text-center">
        <thead>
        </thead>
        <tbody>
        <tr>
            <td colspan="2" class="font-weight-bold">Reservation Details</td>
        </tr>
        <tr>
            <td>Reservation Id</td>
            <td>${reservationData.reservationDetails.id}</td>
        </tr>
        <tr>
            <td colspan="2" class="font-weight-bold">Passenger Details</td>
        </tr>
        <tr>
            <td>Passenger Id</td>
            <td>${reservationData.reservationDetails.passengerId}</td>
        </tr>
        <tr>
            <td>Passenger Name</td>
            <td>${reservationData.passengerDetails.firstName} ${reservationData.passengerDetails.lastName}</td>
        </tr>
        <tr>
            <td>Passenger Email</td>
            <td>${reservationData.passengerDetails.email}</td>
        </tr>
        <tr>
            <td>Passenger Phone</td>
            <td>${reservationData.passengerDetails.phone}</td>
        </tr>
        <tr>
            <td colspan="2" class="font-weight-bold">Flight Details</td>
        </tr>
        <tr>
            <td>Flight Number</td>
            <td>${reservationData.flightDetails.flightNumber}</td>
        </tr>
        <tr>
            <td>Flight Operating AirLines Name</td>
            <td>${reservationData.flightDetails.operatingAirlines}</td>
        </tr>
        <tr>
            <td>Flight ArrivalCity</td>
            <td>${reservationData.flightDetails.arrivalCity}</td>
        </tr>
        <tr>
            <td>Flight DepartureCity</td>
            <td>${reservationData.flightDetails.departureCity}</td>
        </tr>
        <tr>
            <td>Flight Date Of Departure</td>
            <td>${reservationData.flightDetails.dateOfDepartment}</td>
        </tr>
        </tbody>
    </table>

</div>
<div class="container">
    <form:form modelAttribute="updateRequest" action="/updateCheckIn">
        <div class="form-group">
            <label>Number OF Bags</label>
            <form:input path="numberOfBags" cssClass="form-control"/>
        </div>
        <form:hidden   value="${reservationData.reservationDetails.id}" path="reservationId"/>
        <form:hidden  value="1" path="checkIn"/>
        <button  class="btn btn-primary" type="submit">CheckIn</button>
    </form:form>
</div>
</body>
</html>
