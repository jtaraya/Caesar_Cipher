package com.jtaraya.models;

//create three fields in String and
//for any fields we need to access PRIVATE and then use getters and setters to access

public class UserInput {
    private String operation;

    private String message;

    private int key;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }





}
