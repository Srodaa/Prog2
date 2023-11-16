package org.example;

public class Teglalap extends Sokszog {
    private double hosszabbOldal;
    private double rovidebbOldal;

    public Teglalap(double hosszabbOldal, double rovidebbOldal) {
        super(4);
        if (hosszabbOldal == 0)
            hosszabbOldal = 1;
        if (rovidebbOldal == 0)
            rovidebbOldal = 1;
        if (Math.abs(hosszabbOldal) < Math.abs(rovidebbOldal)) {
            this.hosszabbOldal = Math.abs(rovidebbOldal);
            this.rovidebbOldal = Math.abs(hosszabbOldal);
        } else {
            this.hosszabbOldal = Math.abs(hosszabbOldal);
            this.rovidebbOldal = Math.abs(rovidebbOldal);
        }
    }

    @Override
    public double kerulet() {
        return 2 * (rovidebbOldal + hosszabbOldal);
    }

    @Override
    public double terulet() {
        return rovidebbOldal * hosszabbOldal;
    }

    public double getHosszabbOldal() {
        return hosszabbOldal;
    }

    public double getRovidebbOldal() {
        return rovidebbOldal;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Teglalap [hosszabbOldal=");
        builder.append(hosszabbOldal);
        builder.append(", rovidebbOldal=");
        builder.append(rovidebbOldal);
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

