package org.example;

public class Wind implements Move {
    private String direction;
    private double speedInMeterPerSec;

    public Wind(String direction, double speedInMeterPerSec) {
        super();
        this.direction = direction;
        this.speedInMeterPerSec = speedInMeterPerSec;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Wind [direction=");
        builder.append(direction);
        builder.append(", speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append("]");
        return builder.toString();
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }
}
