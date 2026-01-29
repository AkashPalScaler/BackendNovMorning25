package ParkingLotManagement.services;

import ParkingLotManagement.models.*;
import ParkingLotManagement.repositories.GateRepository;
import ParkingLotManagement.repositories.TicketRepository;
import ParkingLotManagement.repositories.VehicleRepository;
import ParkingLotManagement.strategies.SlotAllocationStrategy;
import ParkingLotManagement.strategies.SlotAllocationStrategyFactory;

import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String reg_num, String ownerName, String ownerContact, VehicleType vehicleType, Long gateId){
        // Fetch the gate
        Optional<Gate> gateOptional = gateRepository.getById(gateId);
        // Validations of gate - It exists or not, Only Entry should be allowed(issue ticket)
        if(gateOptional.isEmpty()){
            throw new RuntimeException("Invalid gate");
        }
        Gate gate = gateOptional.get();


        // Fetch the operator (no null check required as assuming a gate will at no point have 0 operator)
        Operator operator = gate.getOperator();

        // Find or create Vehicle (upsert)
        Vehicle vehicle = new Vehicle(reg_num, ownerName, ownerContact, vehicleType);
        vehicle = vehicleRepository.upsert(vehicle);

        // Get parking lot from gate
        ParkingLot parkingLot = gate.getParkingLot();

        // Fetch Slot Allocation Strategy
        SlotAllocationType slotAllocationType = parkingLot.getSlot_allocation_type();

        // Get a slot using slot allocation algorithm
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationStrategyFactory.getStrategy(slotAllocationType);
        ParkingSlot slot = slotAllocationStrategy.assignSlot(parkingLot, vehicleType);
        if(slot ==  null){
            throw new RuntimeException("No empty slot available");
        }
        // Create and return ticket
        Ticket ticket = new Ticket(gate, operator, slot, vehicle);
        return ticketRepository.insert(ticket);
    }
}
// Break till: 8:15
