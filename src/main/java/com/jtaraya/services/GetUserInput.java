package com.jtaraya.services;

import com.jtaraya.models.UserInput;
import com.jtaraya.util.Validator;

import java.util.Scanner;

public class GetUserInput {
    public static boolean getUserInput(){
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


        return validator.isValid(userInput);
    }
}
