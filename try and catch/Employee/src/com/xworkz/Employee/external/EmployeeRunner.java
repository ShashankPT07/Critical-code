package com.xworkz.Employee.external;

import com.xworkz.employee.internal.InvalidSalaryException;
import com.xworkz.Employee.internal.InvalidDepartmentException;
import com.xworkz.Employee.internal.InvalidExperienceException;
import com.xworkz.Employee.internal.InvalidEmployeeIDException;
import com.xworkz.Employee.internal.InvalidPositionException;

public class EmployeeRunner {
    public static void main(String[] args) throws Throwable {


        InvalidSalaryException salary = new InvalidSalaryException();
        try {
            salary.validateSalary(50000);
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
        }


        InvalidDepartmentException dept = new InvalidDepartmentException();
        try {
            dept.validateDepartment("DEV");
        } catch (InvalidDepartmentException e) {
            e.printStackTrace();
        }


        InvalidExperienceException exp = new InvalidExperienceException();
        try {
            exp.validateExperience(5);
        } catch (InvalidExperienceException e) {
            e.printStackTrace();
        }


        InvalidEmployeeIDException id = new InvalidEmployeeIDException();
        try {
            id.validateID(101);
        } catch (InvalidEmployeeIDException e) {
            e.printStackTrace();
        }


        InvalidPositionException pos = new InvalidPositionException();
        try {
            pos.validatePosition("Developer");
        } catch (InvalidPositionException e) {
            e.printStackTrace();
        }
    }
}
