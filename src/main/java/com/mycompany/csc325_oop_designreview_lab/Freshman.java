package com.mycompany.csc325_oop_designreview_lab;
// Todo 7: Create two classes for Freshman and Senior
public class Freshman extends Student{
    private int credits;
    public Freshman(String name, int age,int credits) {
        super(name, age);
        this.credits=credits;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    // ToDo 10: Add a toString method for the Freshman class
    public String toString(){
        String str="Name    : " + getName() +
                 "\nAge     : " + getAge() +
                 "\nAddress : " + getAddress() +
                 "\nCredits : " + getCredits() +
                 "\nGPA     : " + getGPA();

        return str;
    }
}
