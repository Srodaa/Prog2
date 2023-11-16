package org.example.PackageAnimalRunner;
import org.example.PackageAnimals.*;

public class Runner {
    public static void main(String[] args) {
        GilaMonster gl1=new GilaMonster("GilaCica", "10");
        Dog d1=new Dog("Blöki");
        Cat c1=new Cat("Hedi");
        Snake s1=new Snake(0.2, "snake1");

        System.out.println(gl1.compareTo(c1));

        c1.setHome("kitchen");
        System.out.println(c1.getHome());
        System.out.println(c1.compareTo(d1));

    }
}
