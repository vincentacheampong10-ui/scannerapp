package com.pluralsight;


import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


// Ask the user for their grade
        System.out.print("Enter your grade (A-F): ");
        String grade = scanner.nextLine();

//        String gradeA = "A";
//        String gradeB = "B";
//        String gradeC = "C";
//        String gradeD = "D";
//        String gradeF = "F";

// Use if-else if statements to print different messages

        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Good job!");
        } else if (grade.equals("C")) {
            System.out.println("You passed.");
        } else if (grade.equals("D"))
            System.out.println("Barely passed.");
        else {
            System.out.println("Failed");
        }


//        String word1="Meat";
//        String word2=new String("Meat");
//        if (word1.equals(word2)){
//            System.out.println("Its correct");
//        }
//
//        Write a program that asks the user for their username and password. Print "Access granted" only if:
//
//        The username is "admin" AND the password is "1234". Otherwise, print "Access denied."

        System.out.print("Username:");
        String Username = scanner.nextLine();

        System.out.print("Password:");
        String Password= scanner.nextLine();

        if (Username.equals("admin") && Password.equals("1234")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }



    }
}
