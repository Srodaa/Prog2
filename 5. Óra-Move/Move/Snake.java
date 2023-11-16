package org.example;

public class Snake implements Animal {

    private double speedInMeterPerSec;
    private String sound="";
    private double weight;
    private int numberOfLegs=0;
    private String snakeType; //water, naked, with shell



    public Snake(double speedInMeterPerSec, double weight, String snakeType) {
        super();
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.weight = weight;
        this.snakeType = snakeType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Snake [speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append(", sound=");
        builder.append(sound);
        builder.append(", weight=");
        builder.append(weight);
        builder.append(", numberOfLegs=");
        builder.append(numberOfLegs);
        builder.append(", snakeType=");
        builder.append(snakeType);
        builder.append("]");
        return builder.toString();
    }

    public String getSnakeType() {
        return snakeType;
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

