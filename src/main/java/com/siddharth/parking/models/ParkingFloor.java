package com.siddharth.parking.models;

import java.util.List;

public class ParkingFloor extends Base {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private FloorStatusEnum parkingFloorStatus;

    public FloorStatusEnum getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(FloorStatusEnum parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
