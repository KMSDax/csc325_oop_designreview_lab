package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

// Todo 7: Create two classes for Freshman and Senior
public class Senior extends Student{
    private int credits;
    public Senior(String name, int age, int credits) {
        super(name, age);
        if(credits<85){
            System.out.println("You need a minimum of 85 credits to take senior classes");
        }
        this.credits = credits;
    }
    public int getCredits() {
        return credits;
    }
    // ToDo 8: The senior class should have a minimum of 85 credits
    public void setCredits(int credits) {
            this.credits = credits;
    }

    // ToDo 11: Add a toString method for the Senior class
    public String toString(){
        String str;
        if(getCredits()>=85) {
            str = "Name    : " + getName() +
                    "\nAge     : " + getAge() +
                    "\nAddress : " + getAddress() +
                    "\nCredits : " + getCredits() +
                    "\nGPA     : " + getGPA();
            //I included this to test how below 85 credits works. originally I wasn't getting the "you need a minimum 85.."
        }else{
            str = "This student requires "+ (85-getCredits() + " more credts to take senior classes.");
        }

        return str;
    }
}
