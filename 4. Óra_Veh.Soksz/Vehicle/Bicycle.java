public class Bicycle extends Vehicle {
    private int size;

    public Bicycle(String registrationNumber) {
        super(2, registrationNumber);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bicycle [size=");
        builder.append(size);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}