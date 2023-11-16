package org.example;

public class Frog implements Animal {

    private double speedInMeterPerSec;
    private String sound="Brekeke";
    private double weight;
    private int numberOfLegs=4;

    public Frog(double speedInMeterPerSec, double weight) {
        super();
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Frog [speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append(", sound=");
        builder.append(sound);
        builder.append(", weight=");
        builder.append(weight);
        builder.append(", numberOfLegs=");
        builder.append(numberOfLegs);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
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

}
