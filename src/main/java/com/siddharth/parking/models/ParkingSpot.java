package com.siddharth.parking.models;

import java.util.List;

public class ParkingSpot extends Base{
    private List<VehicleTypeEnum> supportedVehicleTypes;
    private SpotStatusEnum parkingSpotStatus;
    private int spotNumber;
    private ParkingFloor parkingFloor;

    public List<VehicleTypeEnum> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleTypeEnum> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public SpotStatusEnum getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(SpotStatusEnum parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}