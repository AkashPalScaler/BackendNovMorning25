package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Vehicle;
import ParkingLotManagement.models.VehicleType;

import java.util.TreeMap;

public class VehicleRepository {
    TreeMap<String, Vehicle> vehicleTable = new TreeMap<>();

    public Vehicle upsert(Vehicle vehicle){
        Vehicle existingVehicle  = getByRegNo(vehicle.getReg_number());
        if(existingVehicle == null){
            return insert(vehicle);
        }
        update(vehicle);
        return vehicle;
    }

    private Vehicle insert(Vehicle vehicle){
        vehicleTable.put(vehicle.getReg_number(), vehicle);
        return  vehicle;
    }

    private Vehicle update(Vehicle vehicle){
        vehicleTable.put(vehicle.getReg_number(), vehicle);
        return  vehicle;
    }

    public Vehicle getByRegNo(String regNo){
        Vehicle vehicle = vehicleTable.get(regNo);
        return vehicle;
    }
}
