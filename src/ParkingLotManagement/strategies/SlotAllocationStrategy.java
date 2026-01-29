package ParkingLotManagement.strategies;

import ParkingLotManagement.models.ParkingLot;
import ParkingLotManagement.models.ParkingSlot;
import ParkingLotManagement.models.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
