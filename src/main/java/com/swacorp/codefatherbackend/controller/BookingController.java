package com.swacorp.codefatherbackend.controller;

import com.swacorp.codefatherbackend.model.Booking;
import com.swacorp.codefatherbackend.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings/")
    public List<Booking> getAllBookings(){
        return bookingService.findAll();
    }

}
