package com.sapient.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.booking.model.BookingDetails;
import com.sapient.booking.repository.BookingDetailsRepository;

@RestController
@RequestMapping("/booking")
public class BookingDetailsController {
	@Autowired
	private BookingDetailsRepository repository;
	
	@PostMapping("/add")
	public BookingDetails addBookingDetails(@RequestBody BookingDetails bookingDetails) {
		
		return this.repository.save(bookingDetails);
	}

}
