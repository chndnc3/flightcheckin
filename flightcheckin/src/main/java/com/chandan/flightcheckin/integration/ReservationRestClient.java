package com.chandan.flightcheckin.integration;

import com.chandan.flightcheckin.integration.dto.Reservation;
import com.chandan.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
