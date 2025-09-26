package com.pluralsight;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String firstName= scanner.nextLine();

        System.out.println("Hi "+ firstName+",");








    }
}
