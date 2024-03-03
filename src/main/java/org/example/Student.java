package org.example;

public class Student {
    static int initialStudent = 0;

    Student(){
        initialStudent++;
    }

    int getInitialStudent(){
        return initialStudent;
    }
}
