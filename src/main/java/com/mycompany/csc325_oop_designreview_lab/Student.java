/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
// ToDo 4: Add comments to your code
/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human{
    //Creates private GPA with the constant
    private double GPA;
    private String address;
    // ToDo 2: Fix the resulting errors
    // ToDo 6: Fix the constructor of the Student class
    public Student(String name, int age) {
        super(name, age);
    }
    // ToDo 3: Add a field for GPA and create a setter and a getter
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address=address;
    }

    // ToDo 9: Add a toString method for the Student class
    public String toString(){
        String str=  "Name    : " + getName() +
                   "\nAge     : " + getAge() +
                   "\nAddress : " + getAddress() +
                   "\nGPA     : " + getGPA();

        return str;
    }
}
