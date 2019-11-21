package com.sapient.booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
public class BookingDetails {
	
	@Id
	private long bookingId;

	private long movieId;

	private long theatreId;

	private long userId;

	private long showTimingId;


}
