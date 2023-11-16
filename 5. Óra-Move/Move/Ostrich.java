package org.example;

import java.time.LocalDate;

public class Ostrich implements MeansOfTransport, Animal {
    //Strucc
    private double speedInMeterPerSec;
    private double carryingCapacityInKg;
    private String sound="Bleep"; //
    private double weight;
    private int numberOfLegs=2;
    private String name;
    private String featherPattern; //toll mintázat, egyszinű vagy foltos (plain or spotted)
    private LocalDate birthDate;



    public Ostrich(double speedInMeterPerSec, double carryingCapacityInKg, double weight, String name,
                   String featherPattern, LocalDate birthDate) {
        super();
        this.speedInMeterPerSec = speedInMeterPerSec;
        this.carryingCapacityInKg = carryingCapacityInKg;
        this.weight = weight;
        this.name = name;
        this.featherPattern = featherPattern;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ostrich [speedInMeterPerSec=");
        builder.append(speedInMeterPerSec);
        builder.append(", carryingCapacityInKg=");
        builder.append(carryingCapacityInKg);
        builder.append(", sound=");
        builder.append(sound);
        builder.append(", weight=");
        builder.append(weight);
        builder.append(", numberOfLegs=");
        builder.append(numberOfLegs);
        builder.append(", name=");
        builder.append(name);
        builder.append(", featherPattern=");
        builder.append(featherPattern);
        builder.append(", birthDate=");
        builder.append(birthDate);
        builder.append("]");
        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public String getFeatherPattern() {
        return featherPattern;
    }

    public LocalDate getBirthDate() {
        return birthDate;
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
    public double getCarryingCapacityInKg() {
        return carryingCapacityInKg;
    }

    @Override
    public double getWeightInKg() {
        return weight;
    }

}

