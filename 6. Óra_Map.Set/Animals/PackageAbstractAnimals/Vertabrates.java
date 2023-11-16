package org.example.PackageAbstractAnimals;

public interface Vertabrates extends Pet, Comparable<Vertabrates>{
    int getNumberOfLegs();
    int compareTo(Vertabrates o);
}
