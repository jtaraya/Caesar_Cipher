package com.jtaraya.util;

public class Validator {
    // have three methods.
    // note with public access modifiers
    public boolean operationValidator(String operation){
        return true;
        //checks if operation is encode or decode.
        // if its valid  - operation = encode
        boolean isValid = operation.equalsIgnoreCase( String:"encode") ||
                            operation.equalsIgnoreCase(String: "decode" );
    }
        public boolean messageValidator(String message){
            boolean isBlankOrEmpty = message.isBlank() && message.isEmpty();
            return true;
            //to check that it's not empty for message
        }
        public boolean keyValidator(int key) {
                return true;
            }
}
