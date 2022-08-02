package com.jtaraya;

import com.jtaraya.models.UserInput;
import com.jtaraya.util.Validator;

import java.util.Scanner;

public class Main {
    // create three packages. utilities, models and services to group files.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput = new UserInput();
        Validator validator = new Validator();

        System.out.println("Choose the operation (*encode* || *decode*)");
        operation = scanner.nextLine();
        System.out.println("");

        System.out.print("Enter your message: ");
        message = scanner.nextLine();
        System.out.println("");

        System.out.print("Enter the key: ");
        key = scanner.nextInt();
        System.out.println("");



        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);


        boolean userInputIsValid = validator.isValid(userInput);

        //if true or not

        if (userInputIsValid){
            System.out.println("Proceed");
        } else {
            System.out.println("Do not proceed");
        }





        scanner.close();

    }
}