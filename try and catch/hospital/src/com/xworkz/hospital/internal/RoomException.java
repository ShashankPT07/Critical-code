package com.xworkz.hospital.internal;

public class RoomException extends Exception {

    public String checkRoom(int roomNo) {
        if(roomNo < 100) {
            return "Room available";
        } else {
            return "Room not available";
        }
    }
}
