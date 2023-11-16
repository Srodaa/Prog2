package org.example.PackageAnimals;
import org.example.PackageAbstractAnimals.PetMammal;
import org.example.PackageAbstractAnimals.ProtectedAnimal;

import java.util.ArrayList;

public class GilaMonster extends PetMammal implements ProtectedAnimal{
    private String lawNumber;

    public GilaMonster(String name, String lawNumber) {
        super(name, "Arizona", 4);
        this.lawNumber = lawNumber;
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> lista=new ArrayList<>();
        lista.add("Eszik");
        lista.add("Játszik");
        lista.add("Alszik");
        return lista;
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }

    @Override
    public String getLawNumber() {
        return lawNumber;
    }

}
