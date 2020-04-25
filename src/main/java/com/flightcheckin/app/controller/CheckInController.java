package com.flightcheckin.app.controller;

import com.flightcheckin.app.dto.ReservationData;
import com.flightcheckin.app.integration.ReservationRestClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {

    private final ReservationRestClient reservationRestClient;

    public CheckInController(ReservationRestClient reservationRestClient) {
        this.reservationRestClient = reservationRestClient;
    }

    @RequestMapping("/checkIn")
    public String sayCheckIn() {
        return "checkIn";
    }

    @RequestMapping(value = "/reservationDetails", method = RequestMethod.GET)
    public String sayReservationDetails(@RequestParam("id") int id, ModelMap modelMap) {
        try {
            ReservationData reservationData = reservationRestClient.findReservationData(id);
            if (reservationData != null) {
                {
                    modelMap.addAttribute("reservationData", reservationData);
                    return "checkInConfirm";
                }
            }
        } catch (Exception ignored) {

        }
        modelMap.addAttribute("msg", "sorry! reservation id not found");
        return "checkIn";

    }
}
