package com.jtaraya.util;

import com.jtaraya.models.UserInput;

public class Validator {
    // have three methods.
    // note with public access modifiers

    public boolean isValid(UserInput userInput){
        boolean oIsValid = operationValidator(userInput.getOperation(), anotherString);
        boolean mIsValid = operationValidator(userInput.getMessage(), anotherString);
        boolean kIsValid = operationValidator(userInput.getKey(), anotherString);

        return oIsValid && mIsValid && kIsValid;
    }
    private boolean operationValidator(String operation, String anotherString){

        //checks if operation is encode or decode.
        // if its valid  - operation = encode
        return operation.equalsIgnoreCase( anotherString "encode") ||
                operation.equalsIgnoreCase( anotherString "decode" );
    }
        private boolean messageValidator(String message){
            return ! (message.isBlank() && message.isEmpty());
            //to check that it's not empty for message
        }
        private boolean keyValidator(int key) {
            return(key >= 1) && (key <= 25);
        }
}
