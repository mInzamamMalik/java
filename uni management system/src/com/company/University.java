package com.company;
import java.util.Scanner;


public class University {

    private String name;
    public University(String name){
        this.name = name;
    }

    private int teacherLength = 0;
    private Teacher[] Teachers = new Teacher[100];

    private int studentLength = 0;
    private Student[] Students = new Student[1000];


    public void addTeacher(){

        String teacherName ;
        String teacherDepartment;
        String teacherDesignation;

        Scanner input = new Scanner(System.in);
        System.out.println("enter teacher name: ");
        teacherName = input.next();

        System.out.println("enter teacher Departenent: (e.g: CS departnent) ");
        teacherDepartment = input.next();

        System.out.println("enter teacher Designation: (e.g: professor, lecturer or HOD)");
        teacherDesignation = input.next();

        Teachers[teacherLength++] = new Teacher(teacherName, teacherDepartment, teacherDesignation);
    }


    public void viewAllTeacher(){

        System.out.println("Name \t Department \t Designation");

        for(int i=0; i<teacherLength; i++ ){
            System.out.println(Teachers[i].getName() + " \t " + Teachers[i].getDepartment()+ " \t " + Teachers[i].getDesignation());
        }
    }

    public void findTeacher(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter teacher name: ");
        input.next();
    }

    public void addStudent(){

    }
}
