package org.example;

import java.util.ArrayList;

public class Room implements Comparable<Room>{
    private Building building;
    private String roomId;
    private int numberOfSeats;
    private ArrayList<String> attributes;

    public Room(Building building, String roomId) {
        this.building = building;
        this.roomId = roomId;
        this.attributes= new ArrayList<>();
    }

    public void addAttribute(String att){
        attributes.add(att);
    }
    public void delAttribute(String att){
        attributes.remove(att);
    }
    public Building getBuilding() {
        return building;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("building=").append(building);
        sb.append(", roomId='").append(roomId).append('\'');
        sb.append(", numberOfSeats=").append(numberOfSeats);
        sb.append(", attributes=").append(attributes);
        sb.append('}');
        return sb.toString();
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public int compareTo(Room o) {
        return roomId.compareTo(o.roomId);
    }
}
