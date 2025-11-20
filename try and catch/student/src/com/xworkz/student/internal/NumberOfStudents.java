package com.xworkz.student.internal;

import com.xworkz.student.events.Students;

public class NumberOfStudents extends Exception {
    public int numberOfStudents(int total)throws NumberOfStudents{
        int students=0;
        if(total<100){
            System.out.println("number of students");
        }else{
            System.out.println("there are no students");

        }

        return students;

    }

}
