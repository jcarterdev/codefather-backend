package com.swacorp.codefatherbackend.service;

import com.swacorp.codefatherbackend.model.Booking;
import com.swacorp.codefatherbackend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> findAll(){
        return StreamSupport.stream(bookingRepository.findAll().spliterator(), false)
                .toList();
    }
}
