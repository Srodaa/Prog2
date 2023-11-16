package org.example;

import java.util.Objects;

public class Building implements Comparable<Building>{
    private String name;
    private String address;
    public Building(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Building [name=");
        builder.append(name);
        builder.append(", address=");
        builder.append(address);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int compareTo(Building o) {
        return this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }



}
