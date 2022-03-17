package com.company;
import java.util.Scanner;
 class Employe {
     String name;
     int age;
     int salary;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter the name ");
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
        System.out.println("The salary is "+ salary);

    }
}
