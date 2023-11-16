package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class Horse implements MeansOfTransport, Animal, Comparable {

    private double speedInMetersPerSec, carryingCapacity;
    private String sound="Nyihaha";
    private double weight;
    private int numberOfLegs=4;
    private String name, color ;
    private LocalDate birthDate;

    public Horse(double speedInMetersPerSec, double carryingCapacity,
                 double weight, String name, String color,
                 LocalDate birthDate) {
        this.speedInMetersPerSec = speedInMetersPerSec;
        this.carryingCapacity = carryingCapacity;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String getSound() {
        return sound;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return carryingCapacity;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMetersPerSec;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Horse{");
        sb.append("speedInMetersPerSec=").append(speedInMetersPerSec);
        sb.append(", carryingCapacity=").append(carryingCapacity);
        sb.append(", sound='").append(sound).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", numberOfLegs=").append(numberOfLegs);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Horse masik=(Horse)o;
        double sebesseg=this.speedInMetersPerSec-masik.speedInMetersPerSec;
        if (sebesseg==0){
            double teherbiras=this.carryingCapacity-masik.carryingCapacity;
            return -(int)teherbiras;
        }
        return -(int)sebesseg;
    }
}
