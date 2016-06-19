package com.company;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class Teacher {

    public String name;
    public String department;
    public String designation;


    public Teacher(String name,String department, String designation){
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getDesignation(){
        return designation;
    }






}
