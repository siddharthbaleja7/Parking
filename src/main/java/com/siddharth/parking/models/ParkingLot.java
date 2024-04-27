package com.siddharth.parking.models;

import java.util.List;

public class ParkingLot extends Base {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleTypeEnum> vehicleTypes;
    private LotStatusEnum parkingLotStatus;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleTypeEnum> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleTypeEnum> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public LotStatusEnum getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(LotStatusEnum parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
