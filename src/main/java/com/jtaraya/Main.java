package com.jtaraya;

import com.jtaraya.models.UserInput;
import com.jtaraya.services.GetUserInput;
import com.jtaraya.util.Validator;

import java.util.Scanner;

public class Main {
    // create three packages. utilities, models and services to group files.
    public static void main(String[] args) {
        boolean userInputIsValid = GetUserInput.getUserInput();

        //if true or not

        if (userInputIsValid){
            System.out.println("Proceed");
        } else {
            System.out.println("Do not proceed");
        }


    }
}