package com.swacorp.codefatherbackend.repository;

import com.swacorp.codefatherbackend.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
