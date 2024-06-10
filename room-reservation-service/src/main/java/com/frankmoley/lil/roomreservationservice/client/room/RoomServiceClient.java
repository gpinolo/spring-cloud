package com.frankmoley.lil.roomreservationservice.client.room;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("room")
public interface RoomServiceClient {

    @GetMapping("/rooms")
    public List<Room> getAll();

    @PostMapping("/rooms")
    public Room addRoom(@RequestBody Room room);

    @GetMapping("/rooms/{id}")
    public Room getRoom(@PathVariable long id);

    @PutMapping("/rooms")
    public void updateRoom(@RequestBody Room room);

    @DeleteMapping("/rooms/{id}")
    public void deleteRoom(@PathVariable long id);
}
