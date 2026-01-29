package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Ticket;

import java.util.TreeMap;

public class TicketRepository {
    private TreeMap<Long, Ticket> ticketTable = new TreeMap<>();
    private long prevId = 0l;
    public Ticket insert(Ticket ticket){
        ticket.setId(prevId++);
        ticketTable.put(prevId, ticket);
        return ticket;
    }
}
