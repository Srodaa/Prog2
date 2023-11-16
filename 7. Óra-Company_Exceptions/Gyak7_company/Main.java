package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Company c1 = new Company("BMW Bt.", "Szabo Adam");
        System.out.println("hello");
        Department d1 = new Department("it", "it dept");
        c1.addDepartment(d1);
        Department d2 = new Department("sales", "sales dept");
        c1.addDepartment(d2);
        Department d3 = new Department("network", "network dept");
        c1.addDepartment(d3);
        System.out.println("hello");

        System.out.println(c1.getDepartments());

        Employee e1 = null;
        try {
            e1 = new Employee(10, "Steve Black", LocalDate.of(2000, Month.DECEMBER, 30));
        } catch (WrongBirthDateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(e1);

        try {
            d1.addEmployee(e1);
        } catch(DeptDoesNotContainEmpException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("abraka");

        System.out.println(c1.getDepartments());
        System.out.println("ab2");

        EmployeeWithSizes ew1 = null;
        try {
            ew1 = new EmployeeWithSizes("John", "Johnny", LocalDate.of(2001, 12, 1), 10);
            ew1.setShoeSize(50);
            ew1.setHeightInCm(10);
        } catch (CompanyException e) {
            System.out.println(e.getMessage());
        }

        EmployeeWithSizes ew2 = null;
        try {
            ew2 = new EmployeeWithSizes( "Bela", LocalDate.of(2000, 1, 1), 20);
        } catch (CompanyException e) {
            System.out.println(e.getMessage());
        }

        try {
            ew2.setShoeSize(60);
            ew2.setHeightInCm(10);
        } catch (ShoeSizeException | HeightException e) {
            System.out.println(e.getMessage());
        }

        EmployeeWithSizes ew3 = null;
        try {
            ew3 = new EmployeeWithSizes( "Bela", LocalDate.of(2000, 1, 1), 20);
        } catch (CompanyException e) {
            System.out.println(e.getMessage());
        }

        try {
            ew2.setShoeSize(50);
            ew2.setHeightInCm(10);
        } catch (SizeException e) {
            System.out.println(e.getMessage());
        }


    }
}