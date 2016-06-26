package com.company;

import java.util.Scanner;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Student {

    private String name;
    private int age;
    private String roll;
    private String majorSubject;

    Student(String name, int age, String roll, String major) {
        name = name;
        age = age;
        roll = roll;
        majorSubject = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRoll() {
        return roll;
    }

    public String getMajorSubject() {
        return majorSubject;
    }


}
