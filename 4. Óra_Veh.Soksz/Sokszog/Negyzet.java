package org.example;

public class Negyzet extends Teglalap {

    public Negyzet(double oldalhossz) {
        super(oldalhossz, oldalhossz);
    }

    /* ezt nem tudtam generálni */
    public double getOldalhossz() {
        return super.getHosszabbOldal();
    }

    /* ahogy ezt sem tudtam generálni */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Negyzet [oldalhossz=");
        builder.append(super.getHosszabbOldal());
        builder.append(", getKerulet()=");
        builder.append(kerulet());
        builder.append(", getTerulet()=");
        builder.append(terulet());
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}

