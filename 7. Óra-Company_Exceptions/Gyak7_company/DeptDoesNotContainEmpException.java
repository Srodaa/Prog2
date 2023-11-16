package org.example;

public class DeptDoesNotContainEmpException extends CompanyException{
    public DeptDoesNotContainEmpException(String message) {
        super(message);
    }
}
