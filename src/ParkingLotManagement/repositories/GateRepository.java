package ParkingLotManagement.repositories;

import ParkingLotManagement.models.Gate;

import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    // Some DB connection dependency (ORM)
    private TreeMap<Long, Gate> gateTable = new TreeMap<>();
    private Long prevId = 0l;

    public Gate insert(Gate gate){
        // Insert Query to ORM
        gate.setId(prevId++);
        gateTable.put(gate.getId(), gate);
        return gate;
    }

//    public Gate getById(Long gateId){
//        // select query to ORM
//        Gate gate = gateTable.get(gateId);
//        return gate;
//    }

    public Optional<Gate> getById(Long gateId){
        Gate gate = gateTable.get(gateId);
        return Optional.ofNullable(gate);
    }
}
