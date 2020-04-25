package com.flightcheckin.app.integration;

import com.flightcheckin.app.dto.ReservationData;
import org.springframework.stereotype.Component;

public interface ReservationRestClient {
    public ReservationData findReservationData(int reservationId);

}
