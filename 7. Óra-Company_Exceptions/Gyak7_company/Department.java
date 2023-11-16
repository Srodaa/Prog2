package org.example;

import java.util.HashSet;
import java.util.Objects;

//TODO
public class Department implements Comparable<Department>{
    private String id, name;
    private HashSet<Employee> employees;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
        employees=new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee emp) throws DeptDoesNotContainEmpException{
        employees.add(emp);
        emp.setDepartment(this);

    }

    public void removeEmployee(Employee emp){
        employees.remove(emp);
        try{
            emp.setDepartment(null);
        } catch(DeptDoesNotContainEmpException e){
            System.err.println("Dept does not cotain emp");
            e.printStackTrace();
        }
    }

    public static void employeeMove(Employee emp, Department fromDept, Department toDept) throws DeptDoesNotContainEmpException{
        fromDept.removeEmployee(emp);
        toDept.addEmployee(emp);
    }

    @Override
    public int compareTo(Department o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employees);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", employees=").append(employees);
        sb.append('}');
        return sb.toString();
    }
}
