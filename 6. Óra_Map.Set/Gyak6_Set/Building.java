package org.example;

import java.util.Objects;

public class Building {
    private String name, address;

    public Building(String name, String address) {
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
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return name.equals(building.name) && address.equals(building.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
