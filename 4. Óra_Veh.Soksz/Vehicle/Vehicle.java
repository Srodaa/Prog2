import java.util.Objects;

public class Vehicle {
    private VehicleStatus status;
    private int NumberOfWheels;
    private String id;


    public Vehicle(String id) {
        super();
        this.id = id;
        status = VehicleStatus.PARK;
    }


    public Vehicle(int numberOfWheels, String id) {
        this(id);
        NumberOfWheels = numberOfWheels;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public String getId() {
        return id;
    }

    public void setMove() {
        status = VehicleStatus.MOVE;
    }

    public void setStop() {
        status = VehicleStatus.STOP;
    }

    public void setPark() {
        status = VehicleStatus.PARK;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Vehicle [status=");
        builder.append(status);
        builder.append(", NumberOfWheels=");
        builder.append(NumberOfWheels);
        builder.append(", id=");
        builder.append(id);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Vehicle))
            return false;
        Vehicle other = (Vehicle) obj;
        return Objects.equals(id, other.id);
    }


}