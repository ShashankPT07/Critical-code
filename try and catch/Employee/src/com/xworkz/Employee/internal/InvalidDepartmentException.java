package com.xworkz.Employee.internal;



public class InvalidDepartmentException extends Exception {

    public String validateDepartment(String dept) throws InvalidDepartmentException {
        String value = "";

        if (dept.equals("HR") || dept.equals("DEV") || dept.equals("FINANCE")) {
            System.out.println("Department is valid");
        } else {
            System.out.println("Invalid department");
        }

        return value;
    }
}

