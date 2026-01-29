package ParkingLotManagement.controllers;

import ParkingLotManagement.DTOs.IssueTicketRequestDTO;
import ParkingLotManagement.DTOs.IssueTicketResponseDTO;
import ParkingLotManagement.models.ResponseStatus;
import ParkingLotManagement.models.Ticket;
import ParkingLotManagement.services.TicketService;

import java.util.Date;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();

        try{
            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getReg_number(),
                    requestDTO.getOwner_name(),
                    requestDTO.getOwner_number(),
                    requestDTO.getVehicle_type(),
                    requestDTO.getGate_id());
            if(ticket == null){
                throw new RuntimeException("Invalid ticket generated");
            }

            responseDTO.setTicketId(ticket.getId());
            responseDTO.setTicket_number(ticket.getNumber());
            responseDTO.setEntry_time(new Date());
            responseDTO.setSlot_number(ticket.getParkingSlot().getNumber());
            responseDTO.setReg_num_vehicle(ticket.getVehicle().getReg_number());
            responseDTO.setOperatorName(ticket.getOperator().getName());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setResponseMessage("Ticket generated successfully");
            return responseDTO;

        }catch (Exception e){
            System.out.println("Error in issue ticket : " + e.getStackTrace());
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setResponseMessage(e.getMessage());
            return responseDTO;
        }
    }
}
