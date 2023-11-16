package org.example.PackageAnimals;
import org.example.PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Dog extends PetMammal{

    public Dog(String name) {
        super(name, "A mi otthonunk", 4);
    }

    @Override
    public String makeSound() {
        return "Vau vau";
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> lista=new ArrayList<>();
        lista.add("Eszik");
        lista.add("Játszik");
        lista.add("Ásik");
        lista.add("Csontot rág");
        lista.add("Alszik");
        return lista;
    }
}
