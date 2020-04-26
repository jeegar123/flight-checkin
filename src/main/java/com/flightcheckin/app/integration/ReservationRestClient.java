package com.flightcheckin.app.integration;

import com.flightcheckin.app.dto.ReservationData;
import com.flightcheckin.app.dto.ReservationUpdateRequest;
import com.flightcheckin.app.model.Reservation;
import org.springframework.stereotype.Component;

public interface ReservationRestClient {
    public ReservationData findReservationData(int reservationId);
    public Reservation updateCheckInDetails(ReservationUpdateRequest updateRequest);
}
