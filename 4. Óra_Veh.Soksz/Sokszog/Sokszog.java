package org.example;

public abstract class Sokszog {
    private int szogekSzama;

    public Sokszog(int szogekSzama) {
        this.szogekSzama = szogekSzama;
    }
    public abstract double kerulet();
    public abstract double terulet();

    public int getSzogekSzama() {
        return szogekSzama;
    }

    @Override
    public String toString() {
        return "Sokszog{" +
                "szogekSzama=" + szogekSzama +
                '}';
    }
}
