package com.jtaraya.util;

public class Validator {
    // have three methods.
    // note with public access modifiers
    public boolean operationValidator(String operation){
        return true;
        //checks if operation is encode or decode.
        // if its valid  - operation = encode
        String encode = "encode";
        boolean isValid = operation.equalsIgnoreCase( String:"encode")
    }
        public boolean messageValidator(String message){
            return true;
            //to check that its not empty for message
        }
            public boolean keyValidator(int key){
                return true;
            }
}
