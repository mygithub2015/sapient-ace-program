package com.sapient.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.booking.model.BookingDetails;

public interface BookingDetailsRepository extends MongoRepository<BookingDetails, Long> {

}
