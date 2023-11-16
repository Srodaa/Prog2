package org.example.PackageAbstractAnimals;

import java.util.ArrayList;

public abstract class PetMammal implements Pet, Vertabrates{
    private String name, home;
    private int numberOfLegs;

    protected PetMammal(String name, String home, int numberOfLegs) {
        this.name = name;
        this.home = home;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    protected String getHome() {
        return home;
    }

    protected void setHome(String home) {
        this.home = home;
    }

    public abstract ArrayList<String> getActivityList();

    @Override
    public int compareTo(Vertabrates o){
        int numberOfLegsDiff=this.numberOfLegs-o.getNumberOfLegs();
        if (numberOfLegsDiff!=0)
            return numberOfLegsDiff;
        PetMammal other=(PetMammal) o;
        return name.compareTo(other.getName());
    }
}
