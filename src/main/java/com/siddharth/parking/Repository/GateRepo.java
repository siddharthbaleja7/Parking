package com.siddharth.parking.Repository;

import com.siddharth.parking.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepo {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}