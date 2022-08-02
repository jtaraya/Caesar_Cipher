package com.jtaraya.util;

import com.jtaraya.models.UserInput;

public class Validator {

    // have three methods.
    // note with public access modifiers

    public boolean isValid(UserInput userInput){
        boolean oIsValid = operationValidator(userInput.getOperation());
        boolean mIsValid = messageValidator(userInput.getMessage());
        boolean kIsValid = keyValidator(userInput.getKey());

        return oIsValid && mIsValid && kIsValid;
    }
    public boolean operationValidator(String operation){

        //checks if operation is encode or decode.
        // if its valid  - operation = encode

        return operation.equalsIgnoreCase("encode") ||
                operation.equalsIgnoreCase("decode");


    }
        private boolean messageValidator(String message){
            return ! (message.isBlank() && message.isEmpty());
            //to check that it's not empty for message
        }
        private boolean keyValidator(int key) {
            return(key >= 1) && (key <= 25);
        }
}
