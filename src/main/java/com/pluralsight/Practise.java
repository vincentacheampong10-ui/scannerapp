package com.pluralsight;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What is your name?:");
//        String name = scanner.nextLine();


        System.out.print("How old are you?:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }


    }
}
