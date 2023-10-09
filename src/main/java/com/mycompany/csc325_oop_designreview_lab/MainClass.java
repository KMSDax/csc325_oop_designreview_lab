/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
		// ToDo 5: Fix the error
	 //I couldn't resolve this the original way you had it where the object was initialized as Student
	 //I changed them to their respective classes I also converted from short to int to simplify the solution..
		Student std1= new Student("James", 20);

		Freshman std2= new Freshman("James", 20, 12); // name, age, credits
	//Changed this to std3 from std2, wasn't sure if you wanted us to update the other Student to Freshman and update the variables?
        Senior std3 = new Senior("John", 30, 50);

	//I used a loop here to give each student an array based on the instructions?
	//I wasn't sure if you wanted it done differently.
		Student[] Students = {std1,std2,std3};
		// ToDo 12: Set the gpa of the student using the scanner and user
		for(Student stu: Students){
			// 			input and then print the output.
			System.out.println("Please input the GPA for " + stu.getName());
			double gpa = s.nextDouble();
			stu.setGPA(gpa);
		}


		System.out.println(std1 + "\n=================");
		System.out.println(std2 + "\n=================");
	 	System.out.println(std3);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}

