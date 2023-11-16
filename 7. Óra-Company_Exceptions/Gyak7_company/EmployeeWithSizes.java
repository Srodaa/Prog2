package org.example;

import java.time.LocalDate;

public class EmployeeWithSizes extends Employee{
    private int shoeSize, heightInCm;

    public EmployeeWithSizes(String name, LocalDate birthdate, int id) throws WrongBirthDateException {
        super(id, name, birthdate);
    }

    public EmployeeWithSizes(String name, String nickname, LocalDate birthdate, int id) throws WrongBirthDateException{
        super(id, nickname, birthdate, name);
    }

    /**
     *
     * @return The shoe size of the employee
     */
    public int getShoeSize() {
        return shoeSize;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    /**
     * Set the shoe size
     *
     * @param shoeSize The shoe size to be set
     * @throws ShoeSizeException if the shoe size is smaller than 10 or greater than 50
     */
    public void setShoeSize(int shoeSize) throws ShoeSizeException{
        if (shoeSize<10 || shoeSize>50)
            throw new ShoeSizeException("Rossz cipőméret!");
        this.shoeSize = shoeSize;
    }

    public void setHeightInCm(int heightInCm) throws HeightException{
        if (heightInCm<20 || heightInCm>300)
            throw new HeightException("Rossz testmagasság!");
        this.heightInCm = heightInCm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeWithSizes{");
        sb.append("shoeSize=").append(shoeSize);
        sb.append(", heightInCm=").append(heightInCm);
        sb.append('}');
        return sb.toString();
    }
}
