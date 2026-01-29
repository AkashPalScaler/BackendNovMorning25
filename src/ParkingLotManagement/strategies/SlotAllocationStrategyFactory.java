package ParkingLotManagement.strategies;

import ParkingLotManagement.models.SlotAllocationType;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getStrategy(SlotAllocationType type){
        if(type == SlotAllocationType.HYBRID){
            return new HybridSlotAllocationStrategy();
        }
        else{
            throw new RuntimeException("Invalid slot allocation strategy");
        }
    }
}
