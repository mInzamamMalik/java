package com.company;

import java.util.Scanner;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Student {

    private String name;
    private String age;
    private String roll;
    private String majorSubject;

    Student(String name, String age, String roll, String major) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.majorSubject = major;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getRoll() {
        return roll;
    }

    public String getMajorSubject() {
        return majorSubject;
    }


}
