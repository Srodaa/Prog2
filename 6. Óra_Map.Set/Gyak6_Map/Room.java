package org.example;

import java.util.ArrayList;

public class Room implements Comparable<Room>{
    private Building building;
    private String roomId;
    private int numberOfSeats;
    private ArrayList<String> attributes;

    public Room(Building building, String roomId) {
        super();
        this.building = building;
        this.roomId = roomId;
        this.attributes=new ArrayList<>();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void addAttribute(String attribute) {
        this.attributes.add(attribute);
    }

    public void DelAttribute(String attribute) {
        this.attributes.remove(attribute);
    }

    public Building getBuilding() {
        return building;
    }

    public String getRoomId() {
        return roomId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Room [building=");
        builder.append(building);
        builder.append(", roomId=");
        builder.append(roomId);
        builder.append(", numberOfSeats=");
        builder.append(numberOfSeats);
        builder.append(", attributes=");
        builder.append(attributes);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int compareTo(Room o) {
        int v=this.building.compareTo(o.building);
        if (v!=0) return v;
        return this.roomId.compareTo(o.roomId);
    }



}

