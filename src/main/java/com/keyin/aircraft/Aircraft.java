package com.keyin.aircraft;

import com.keyin.airport.Airport;
import java.util.ArrayList;
import java.util.List;

public class Aircraft {

    private Long aircraftID;
    private String type;
    private String airlineName;
    private int noPassengers;
    private List<Airport> airports;

    public Aircraft(){
        airports = new ArrayList<>();
    }

    public Long getId() {
        return aircraftID;
    }

    public void setId(Long id) {
        this.aircraftID = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getNoPassengers() {
        return noPassengers;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public void removeAllowedAirport(Airport airport) {
        airports.remove(airport);
    }

}