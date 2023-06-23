package com.keyin.airport;

import com.keyin.passenger.Passenger;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private Long airportID;
    private String airportName;
    private String airportCode;
    private List<Passenger> passengerList;

    public Airport() { passengerList = new ArrayList<>(); }

    public Long getId() {
        return airportID;
    }

    public void setId(Long airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public List<Passenger> getPassengersList() {
        return passengerList;
    }

    public void addPassengerList(Passenger passenger) {
        passengerList.add(passenger);
    }

    public void setPassengersList(List<Passenger> passengersList) {
        this.passengerList = passengersList;
    }
}