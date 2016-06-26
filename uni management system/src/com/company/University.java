package com.company;

import java.util.*;


public class University {

    private String name;

    public University(String name) {
        this.name = name;
    }
    private ArrayList<Teacher> Teachers = new ArrayList<Teacher>();


    private int studentLength = 0;
    private Student[] Students = new Student[1000];


    public void addTeacher() {

        String teacherName;
        String teacherDepartment;
        String teacherDesignation;

        Scanner input = new Scanner(System.in);
        System.out.println("enter teacher name: ");
        teacherName = input.next();

        System.out.println("enter teacher Departenent: (e.g: CS departnent) ");
        teacherDepartment = input.next();

        System.out.println("enter teacher Designation: (e.g: professor, lecturer or HOD)");
        teacherDesignation = input.next();

        Teachers.add( new Teacher(teacherName, teacherDepartment, teacherDesignation));
    }


    public void viewAllTeacher() {

        System.out.println("Name \t Department \t Designation");




        for (int i = 0; i < Teachers.size(); i++) {
            System.out.println(Teachers.get(i).getName() + " \t " + Teachers.get(i).getDepartment() + " \t " + Teachers.get(i).getDesignation());
        }
    }

    public void findTeacher() {
        boolean header = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KeyWord: ");
        CharSequence keyword = input.next();

        for (int i = 0; i < Teachers.size(); i++) {
            if (Teachers.get(i).getName().contains(keyword) || Teachers.get(i).getDesignation().contains(keyword) || Teachers.get(i).getDepartment().contains(keyword)) {
                if (header) {
                    System.out.println("Name \t Department \t Designation");
                    header = false;
                }
                System.out.println(Teachers.get(i).getName() + "  " + Teachers.get(i).getDepartment() + "  " + Teachers.get(i).getDesignation());
            }
        }
        if (header) {
            System.out.println("no teacher found with this name!!");
        }
    }


    public void deleteTeacher() {
        boolean header = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Exact Name to delete of KeyWord for Suggestion: ");
        CharSequence keyword = input.next();


        System.out.println("Suggestion: ");

        for (int i = 0; i < Teachers.size(); i++) {
            if (Teachers.get(i).getName() == keyword) {

                System.out.println("Do you really want to delete " +Teachers.get(i).getName()+"?? (Y/N)");
                if(input.next().equals("y")){
                    Teachers.remove(i);
                    System.out.println(Teachers.get(i).getName()+" is deleted from record");
                    return;
                }
            }
        }


        for (int i = 0; i < Teachers.size(); i++) {
            if (Teachers.get(i).getName().contains(keyword) || Teachers.get(i).getDesignation().contains(keyword) || Teachers.get(i).getDepartment().contains(keyword)) {
                if (header) {
                    System.out.println("Suggestions: ");
                    header = false;
                }
                System.out.println(Teachers.get(i).getName() + "  " + Teachers.get(i).getDepartment() + "  " + Teachers.get(i).getDesignation());
            }
        }
        if (header) {
            System.out.println("no teacher found with this name!!");
        }

    }


}
