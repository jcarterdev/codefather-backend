package com.swacorp.codefatherbackend.repository;

import com.swacorp.codefatherbackend.model.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Long> {
}
