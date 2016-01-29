package com.week4.Q3;

/**
 * Created by Steve on 28/01/2016.
 */
public class Room {

    private String roomNumber;
    private int tables;
    private boolean computerRoom;
    private boolean available;

    public Room(String roomNumber, int tables, boolean computerRoom, boolean available){
        this.roomNumber = roomNumber;
        this.tables = tables;
        this.computerRoom = computerRoom;
        this.available = available;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getTables() {
        return tables;
    }

    public boolean isComputerRoom() {
        return computerRoom;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
