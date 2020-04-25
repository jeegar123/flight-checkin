package com.flightcheckin.app.model;

import java.sql.Date;
import java.sql.Timestamp;


public class Flight {
    private int id;
    private String flightNumber;
    private String operatingAirlines;
    private String arrivalCity;
    private String departureCity;
    private Date dateOfDepartment;
    private Timestamp estimateDepartmentTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public Date getDateOfDepartment() {
        return dateOfDepartment;
    }

    public void setDateOfDepartment(Date dateOfDepartment) {
        this.dateOfDepartment = dateOfDepartment;
    }

    public Timestamp getEstimateDepartmentTime() {
        return estimateDepartmentTime;
    }

    public void setEstimateDepartmentTime(Timestamp estimateDepartmentTime) {
        this.estimateDepartmentTime = estimateDepartmentTime;
    }
}
