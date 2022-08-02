package com.jtaraya.services;
// add CaesarCipher class and add methods

public class CaesarCipher {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //encode -> newIndex = (oldIndex + key ) % 26; if newIndex > 25 then subtract 26
    //decode -> newIndex = (oldIndex - key ) % 26; if newIndex < 0 then add 26



    public String encode() {
        // TODO takes plain text as input and returns cipher text
        return "";

    }

    public String decode() {
        // TODO takes cipher text as input and returns plain text
        return "";
    }
}
