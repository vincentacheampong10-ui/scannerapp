package com.pluralsight;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is your name:");
        String firstName= scanner.nextLine();
        System.out.print("Hi "+firstName+".");

        System.out.print("How old are you?: ");
        int age= scanner.nextInt();

        System.out.print("How tall are you in cm?: ");
        int height= scanner.nextInt();
        System.out.println("You are "+ height+"cm");
        String heights= scanner.nextLine();


           














    }
}
