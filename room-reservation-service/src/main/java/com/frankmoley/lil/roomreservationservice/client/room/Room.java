package com.frankmoley.lil.roomreservationservice.client.room;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
    private long roomId;
    private String Name;
    private String roomNumber;
    private String bedInfo;

    public Room(long roomId, String name, String roomNumber, String bedInfo) {
        this.roomId = roomId;
        Name = name;
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }
}
