package com.frankmoley.lil.roomreservationservice.client.reservation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("reservation")
public interface ReservationServiceClient {

    @GetMapping("/reservations")
    List<Reservation> getAll(@RequestParam(value = "dateString", required = false) String dateString,
                             @RequestParam(value = "guestId", required = false) Long guestId) ;

    @PostMapping("/reservations")
    Reservation addReservation(@RequestBody Reservation reservation);

    @GetMapping("/reservations/{id}")
    Reservation getReservation(@PathVariable long id);

    @PutMapping("/reservations")
    void updateReservation(@RequestBody Reservation reservation);

    @DeleteMapping("/reservations/{id}")
    void deleteReservation(@PathVariable long id);

}
