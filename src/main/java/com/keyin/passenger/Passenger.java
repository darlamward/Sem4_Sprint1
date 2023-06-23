package com.keyin.passenger;

import com.keyin.aircraft.Aircraft;
import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private Long passengerID;
    private String firstName;
    private String lastName;
    private int phoneNum;
    private List<Aircraft> aircraftList;


    public Passenger() { aircraftList = new ArrayList<>(); }

    public Long getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(Long passengerID) {
        this.passengerID = passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void addAircraftList(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }
}
