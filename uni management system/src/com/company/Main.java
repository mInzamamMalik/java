package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        University uni = new University("Federal Urdu");

        print("Wellcome to Uni Management System");
        print("");
        print("1. Add Teacher");
        print("2. Find Teacher");
        print("3. View All Teacher");
        print("");
        print("4. Add Student");
        print("5. Find Student");
        print("6. View All Student");

        int choice = input.nextInt();

        switch(choice){

            case 1:
                uni.addTeacher();
                break;

            case 2:
                break;

            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                print("invalid input");
        }






//        uni.addTeacher();
        //uni.addStudent();




    }
    public static void print(String line){
        System.out.println(line);
    };

}
