package com.jtaraya;

import com.jtaraya.models.UserInput;
import com.jtaraya.services.CaesarCipher;
import com.jtaraya.services.GetUserInput;
import com.jtaraya.util.Validator;

import java.util.Scanner;

public class Main {
    // create three packages. utilities, models and services to group files.
    public static void main(String[] args) {
        boolean userInputIsValid = GetUserInput.getUserInput();

        //if true or not

        if (userInputIsValid){
            UserInput userInput = GetUserInput.input;
            CaesarCipher caesarCipher = new CaesarCipher();

            if (userInput.getOperation().equalsIgnoreCase("encode")){
               String cipherText = caesarCipher.encode(userInput.getMessage(), userInput.getKey());
                System.out.println("cipher text is: " + cipherText);

            } else if (userInput.getOperation().equalsIgnoreCase("decode")) {
                String plainText = caesarCipher.decode(userInput.getMessage(), userInput.getKey());
                System.out.println("plain text is: " + plainText);

            }
        } else {
            System.out.println("Do not proceed");
        }


    }
}