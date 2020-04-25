package com.flightcheckin.app.integration;

import com.flightcheckin.app.dto.ReservationData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {
    public static final String RESERVATION_URL = "http://localhost:8080/reservation/";

    @Override
    public ReservationData findReservationData(int reservationId) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(RESERVATION_URL + reservationId, ReservationData.class);
    }
}
