public class Car extends Vehicle {
    private boolean engineIsWorking;
    private int horsepower;

    public Car(String licensePlate) {
        super(4, licensePlate);
        this.engineIsWorking = false;
    }

    public Car(String licensePlate, int horsepower) {
        this(licensePlate);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isEngineIsWorking() {
        return engineIsWorking;
    }

    public void setEngineToWork() {
        this.engineIsWorking = true;
    }

    public void setEngineToStop() {
        this.engineIsWorking = false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("car [engineIsWorking=");
        builder.append(engineIsWorking);
        builder.append(", horsepower=");
        builder.append(horsepower);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    @Override
    public void setMove() {
        super.setMove();
        this.setEngineToWork();
    }

    @Override
    public void setStop() {
        super.setStop();
        this.setEngineToWork();
    }

    @Override
    public void setPark() {
        super.setPark();
        this.setEngineToStop();
    }


}
