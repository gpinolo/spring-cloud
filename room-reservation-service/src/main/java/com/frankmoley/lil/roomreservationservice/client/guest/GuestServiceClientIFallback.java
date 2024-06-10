package com.frankmoley.lil.roomreservationservice.client.guest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceClientIFallback implements GuestServiceClient {
    @Override
    public List<Guest> getAll() {
        return List.of();
    }

    @Override
    public Guest addGuest(Guest guest) {
        return null;
    }

    @Override
    public Guest getGuest(long id) {
        return new Guest(id,
                "UNVAILABLE",
                "UNVAILABLE",
                "UNVAILABLE",
                "UNVAILABLE",
                "UNVAILABLE",
                "UNVAILABLE",
                "UNVAILABLE");
    }

    @Override
    public void updateGuest(Guest guest) {

    }

    @Override
    public void deleteGuest(long id) {

    }
}
