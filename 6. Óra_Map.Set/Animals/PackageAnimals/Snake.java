package org.example.PackageAnimals;

import org.example.PackageAbstractAnimals.Pet;

public class Snake implements Pet, Comparable<Snake> {
    private double speedInMetersPerSec;
    private String name;

    public Snake(double speedInMetersPerSec, String name) {
        this.speedInMetersPerSec = speedInMetersPerSec;
        this.name=name;
    }

    @Override
    public int compareTo(Snake o) {
        int speedDiff=Double.compare(speedInMetersPerSec, o.speedInMetersPerSec);
        if (speedDiff!=0)
            return speedDiff;
        return name.compareTo(o.getName());
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSpeedInMetersPerSec() {
        return speedInMetersPerSec;
    }
}
