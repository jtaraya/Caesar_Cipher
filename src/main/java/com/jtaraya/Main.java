package com.jtaraya;

import java.util.Scanner;

public class Main {
    // create three packages. utilities, models and services to group files.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation;
        String message;
        int key;

        System.out.println("Choose the operation (encode || decode)");
        operation = scanner.nextLine();
        System.out.println("");

        System.out.println("Enter your message: ");
        message = scanner.nextLine();
        System.out.println("");

        System.out.println("Enter the key: ");
        key = scanner.nextInt();
        System.out.println("");






        scanner.close();

    }
}