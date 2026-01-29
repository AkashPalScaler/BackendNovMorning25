package ParkingLotManagement.strategies;

import ParkingLotManagement.models.*;

public class HybridSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        if(parkingLot.getStatus().equals(ParkingLotStatus.FILLED)){
            return null;
        }
        for(ParkingFloor floor : parkingLot.getFloors()){
            if(floor.getStatus().equals(FloorStatus.FILLED)){
                return null;
            }
            for(ParkingSlot slot : floor.getParkingSlots()){
                if(slot.getStatus().equals(ParkingSlotStatus.EMPTY) && slot.checkIfVehicleAllowed(vehicleType)){
                    slot.setStatus(ParkingSlotStatus.FILLED);
                    return slot;
                }
            }
        }
        return null;

    }
}
// HW : Add the logic to update status of floor and parkinglot every time a slot is updated
// HW: AllowedVehicles capacity at every level (lot, floor, slot) needs to be updated after every slot assignment