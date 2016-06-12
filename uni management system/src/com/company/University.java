package com.company;
import java.util.Scanner;


public class University {

    public University(String name){
        this.name = name;
    }
    private String name;
    private Teacher[] Teachers = new Teacher[]{};








    public void addTeacher(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter teacher name: ");
        input.next();

    }

    public void addStudent(){

    }
}
