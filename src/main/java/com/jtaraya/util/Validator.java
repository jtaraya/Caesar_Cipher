package com.jtaraya.util;

public class Validator {
    // have three methods.
    // note with public access modifiers

    public boolean isValid(String o, String m, int k){
        boolean oIsValid = operationValidator(o);
        boolean mIsValid = operationValidator(m);
        boolean kIsValid = operationValidator(k);

        return oIsValid && mIsValid && kIsValid;
    }
    private boolean operationValidator(String operation){

        //checks if operation is encode or decode.
        // if its valid  - operation = encode
        return operation.equalsIgnoreCase(String:"encode") ||
                operation.equalsIgnoreCase(String: "decode" );
    }
        private boolean messageValidator(String message){
            return ! (message.isBlank() && message.isEmpty());
            //to check that it's not empty for message
        }
        private boolean keyValidator(int key) {
            return(key >= 1) && (key <= 25);
        }
}
