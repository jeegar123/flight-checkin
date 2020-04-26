package com.flightcheckin.app.integration;

import com.flightcheckin.app.dto.ReservationData;
import com.flightcheckin.app.dto.ReservationUpdateRequest;
import com.flightcheckin.app.model.Reservation;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {
    public static final String RESERVATION_URL = "http://localhost:8080/reservation/";

    @Override
    public ReservationData findReservationData(int reservationId) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(RESERVATION_URL + reservationId, ReservationData.class);
    }

    @Override
    public Reservation updateCheckInDetails(ReservationUpdateRequest updateRequest) {
        RequestEntity<ReservationUpdateRequest> requestEntity = null;
        try {
            requestEntity = RequestEntity.put(new URI(RESERVATION_URL))
                    .accept(MediaType.APPLICATION_JSON)
                    .body(updateRequest);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        RestTemplate restTemplate = new RestTemplate();
        assert requestEntity != null;
        ResponseEntity<Reservation> responseEntity= restTemplate.exchange(requestEntity,Reservation.class);
        return responseEntity.getBody();

    }
}
