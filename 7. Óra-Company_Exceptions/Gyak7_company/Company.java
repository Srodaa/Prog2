package org.example;

import java.util.TreeSet;

public class Company {

    private String name, nameOfLeader;
    private TreeSet<Department> departments;

    public Company(String name, String nameOfLeader) {
        this.name = name;
        this.nameOfLeader = nameOfLeader;
        departments= new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public String getNameOfLeader() {
        return nameOfLeader;
    }

    public void setNameOfLeader(String nameOfLeader) {
        this.nameOfLeader = nameOfLeader;
    }

    public TreeSet<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department dept){
        departments.add(dept);
    }
    public void removeDepartment(Department dept){
        departments.remove(dept);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", nameOfLeader='").append(nameOfLeader).append('\'');
        sb.append(", departments=").append(departments);
        sb.append('}');
        return sb.toString();
    }
}
