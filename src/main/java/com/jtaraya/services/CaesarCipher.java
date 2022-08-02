package com.jtaraya.services;
// add CaesarCipher class and add methods

public class CaesarCipher {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //encode -> newIndex = (oldIndex + key ) % 26; if newIndex > 25 then subtract 26
    //decode -> newIndex = (oldIndex - key ) % 26; if newIndex < 0 then add 26


    public String encode(String message, int key) {
        char[] messageArray = message.toCharArray();

        StringBuilder output = new StringBuilder();

        for (char item : messageArray) {
            char temp = shiftChar(item, key);
            output = new StringBuilder(output.append(temp));
        }


        return output.toString();
    }

    public String decode() {
        // TODO takes cipher text as input and returns plain text
        return "";
    }

    private char shiftChar(char c, int k) {

        int oldIndex = ALPHABET.indexOf(c);
        if (oldIndex == -1){
            return c;
        }
        int newIndex = (oldIndex + k) % 26;

        int pos;
        char cipherChar;

        if (newIndex > 25) {
            pos = newIndex - 26;
            cipherChar = ALPHABET.charAt(pos);

        } else if (newIndex < 0) {
            pos = newIndex + 26;
            cipherChar = ALPHABET.charAt(pos);

        } else {
            pos = newIndex;
            cipherChar = ALPHABET.charAt(pos);
        }
        return cipherChar;
    }

}
