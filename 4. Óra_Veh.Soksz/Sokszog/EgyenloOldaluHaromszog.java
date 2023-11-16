package org.example;

public class EgyenloOldaluHaromszog extends Sokszog {

    private double oldalhossz;
    public EgyenloOldaluHaromszog(double oldalhossz) {
        super(3);
        this.oldalhossz=oldalhossz;
    }

    @Override
    public double kerulet() {
        return 3*oldalhossz;
    }

    @Override
    public double terulet() {
        return oldalhossz*oldalhossz*Math.sqrt(3)/4;
    }

    public double getOldalhossz() {
        return oldalhossz;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EgyenloOldaluHaromszog [oldalhossz=");
        builder.append(oldalhossz);
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
