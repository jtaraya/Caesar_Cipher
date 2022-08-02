package com.jtaraya.services;
// add CaesarCipher class and add methods

public class CaesarCipher {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //encode -> newIndex = (oldIndex + key ) % 26; if newIndex > 25 then subtract 26
    //decode -> newIndex = (oldIndex - key ) % 26; if newIndex < 0 then add 26



    public char encode(char c , int key) {
        int oldIndex = ALPHABET.indexOf(c);
        int newIndex = (oldIndex + key) % 26;

        int pos;
        char cipherChar;

        if(newIndex > 25) {
            pos = newIndex - 26;
            cipherChar = ALPHABET.charAt(pos);

        } else if (newIndex < 0) {
            pos = newIndex + 26;
            cipherChar = ALPHABET.charAt(pos)

        } else{
            pos = newIndex;
            cipherChar = ALPHABET.charAt(pos);

        return cipherChar;

        }
        // TODO takes plain text as input and returns cipher text
        return "";

    }

    public String decode() {
        // TODO takes cipher text as input and returns plain text
        return "";
    }
}
