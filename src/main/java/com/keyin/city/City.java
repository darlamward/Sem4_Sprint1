package com.keyin.city;

import com.keyin.airport.Airport;
import java.util.ArrayList;
import java.util.List;

public class City {

    private Long cityID;
    private String name;
    private String state;
    private int population;
    private List<Airport>airportsToCity;

    public City() {
        airportsToCity = new ArrayList<>();
    }

    public City(Long id, String state, int population, String name) {
        this.cityID = id;
        this.state = state;
        this.population = population;
        this.name = name;
    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void addAirportsToCity(Airport airport) {
        airportsToCity.add(airport);
    }
    public List<Airport> getAirportsToCity(){return airportsToCity;}
    @Override
    public String toString() {
        return "City{" +
                "id=" + cityID +
                ", state='" + state + '\'' +
                ", population=" + population +
                ", name='" + name + '\'' +
                '}';
    }
}
