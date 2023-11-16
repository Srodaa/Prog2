package org.example;

public class Lorry implements MeansOfTransport {
    private int numberOfWheels;
    private double enginePowerInKw;

    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private double weight;



    public Lorry(int numberOfWheels, double enginePowerInKw, double speedInMeterPerSec, double carryingCapacityInKg,
                 double weight) {
        super();
        this.numberOfWheels = numberOfWheels;
        this.enginePowerInKw = enginePowerInKw;
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lorry [numberOfWheels=");
        builder.append(numberOfWheels);
        builder.append(", enginePowerInKw=");
        builder.append(enginePowerInKw);
        builder.append(", speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append(", carryingCapacityInKg=");
        builder.append(carryingCapacityInKg);
        builder.append(", weight=");
        builder.append(weight);
        builder.append("]");
        return builder.toString();
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getEnginePowerInKw() {
        return enginePowerInKw;
    }

    @Override
    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }

    @Override
    public double getCarryingCapacityInKg() {
        return carryingCapacityInKg;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }
}

