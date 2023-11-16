package org.example;

import java.time.LocalDate;
import java.util.Objects;
public class Employee extends Person implements Comparable<Employee> {
    private int id;
    private Department department;

    public Employee(int id, String name, LocalDate birthDate) throws WrongBirthDateException {
        super(name, birthDate);
        this.id = id;
    }

    public Employee(int id, String name, LocalDate birthDate, String nickName) throws WrongBirthDateException {
        this(id, name, birthDate);
        this.setNickname(nickName);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) throws DeptDoesNotContainEmpException {
        if (department == null) {
            this.department = null;
            return;
        }
        for (Employee emp : department.getEmployees()) {
            if (emp.equals(this))
                this.department = department;
        }

        if (!this.department.equals(department))
            throw new DeptDoesNotContainEmpException("no employee in dept: " + department);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Employee [id=");
        builder.append(id);
        if (this.department == null) {
            builder.append("Department [null]");
        } else {
            builder.append("Department [id=");
            builder.append(this.department.getId());
            builder.append("; name=");
            builder.append(this.department.getName());
            builder.append("]");
        }
        builder.append(", toString()=");
        builder.append(super.toString());
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
        if (!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
