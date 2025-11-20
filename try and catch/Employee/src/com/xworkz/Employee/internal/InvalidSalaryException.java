package com.xworkz.employee.internal;

public class InvalidSalaryException extends Exception {

    public int validateSalary(int salary) throws InvalidSalaryException {
        int value = 0;

        if (salary > 0 && salary < 1000000) {
            System.out.println("Salary is valid");
        } else {
            System.out.println("Invalid salary");
        }

        return value;
    }
}
