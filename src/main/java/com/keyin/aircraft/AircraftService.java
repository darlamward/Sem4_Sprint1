package com.keyin.aircraft;

import com.keyin.airport.Airport;
import java.util.ArrayList;
import java.util.List;

public class AircraftService {

    private List<Aircraft> aircraftList = new ArrayList<>();

    public AircraftService() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1L);
        aircraft.setType("Boeing");
        aircraft.setAirlineName("WestJet");
        aircraft.setNoPassengers(400);

        aircraftList.add(aircraft);

        Aircraft aircraft2 = new Aircraft();
        aircraft2.setId(2L);
        aircraft2.setType("Airbus");
        aircraft2.setAirlineName("Air Canada");
        aircraft2.setNoPassengers(120);

        aircraftList.add(aircraft2);
    }

    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }

    public List<Aircraft> searchAircraft(String searchTerm) {
        List<Aircraft> searchResults = new ArrayList<>();
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getType().contains(searchTerm) || aircraft.getAirlineName().contains(searchTerm)) {
                searchResults.add(aircraft);
            }
        }
        return searchResults;
    }

    public List<Aircraft> searchById(Long id){
        List<Aircraft> idSearchResult = new ArrayList<>();
        for(Aircraft aircraft: aircraftList){
            if(aircraft.getId().equals(id)){
                idSearchResult.add(aircraft);
            }

        }
        return idSearchResult;
    }

    public List<Aircraft> searchByNoPassengers(int searchNo){
        List<Aircraft> passengersAircraft = new ArrayList<>();
        for(Aircraft aircraft: aircraftList){
            if(aircraft.getNoPassengers() <= searchNo) {
                passengersAircraft.add(aircraft);
            }
        }
       return passengersAircraft;

    }

    public List<Aircraft> deleteAircraft(Long id) {

        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getId().equals(id)) {
                aircraftList.remove(aircraft);
            }
        }
        return aircraftList;
    }

    public void createAircraft(Aircraft aircraft){
        aircraftList.add(aircraft);
    }

    public List<Airport>getAirportList(Aircraft aircraft){
        return aircraft.getAirports();
    }
}