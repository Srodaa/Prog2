package org.example.PackageAnimals;

import org.example.PackageAbstractAnimals.PetMammal;

import java.util.ArrayList;

public class Cat extends PetMammal {

    public Cat(String name) {
        super(name, "A mi otthonunk", 4);
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

    @Override
    public ArrayList<String> getActivityList() {
        ArrayList<String> lista=new ArrayList<>();
        lista.add("Eszik");
        lista.add("Játszik");
        lista.add("Egeret vadászik");
        lista.add("Mászik");
        lista.add("Alszik");
        return lista;
    }

    public String getHome(){
        return super.getHome()+"A CAT OSZTÁLYBÓL";
    }
    public void setHome(String home){
        super.setHome(home+" A CAT OSZTÁLYBÓL");
    }
}
