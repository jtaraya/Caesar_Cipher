package com.jtaraya.services;
// add CaesarCipher class and add methods

public class CaesarCipher {
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //encode -> newIndex = (oldIndex + key ) % 26; if newIndex > 25 then subtract 26
    //decode -> newIndex = (oldIndex - key ) % 26; if newIndex < 0 then add 26


    public String encode(String message, int key) {
        char[] messageArray = message.toCharArray();
        StringBuilder output = new StringBuilder();
        for (char item: messageArray){
            char temp = shiftChar(item, key,'e');
            output.append(temp);
        }
        return output.toString();
    }

    public String decode(String message, int key) {
        //TODO takes cipherText as input and return plainText
        char[] messageArray = message.toCharArray();
        StringBuilder output = new StringBuilder();
        for (char item: messageArray){
            char temp = shiftChar(item, key,'d');
            output.append(temp);
        }
        return output.toString();
    }

    private char shiftChar(char c, int k, char ops) {
        int oldIndex = ALPHABET.indexOf(c);
        if (oldIndex == -1){
            return c;
        }

        int newIndex;
        if (ops ==  'e') {
            newIndex = (oldIndex + k) % 26;
        } else {
            newIndex = (oldIndex - k) % 26;
        }

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
