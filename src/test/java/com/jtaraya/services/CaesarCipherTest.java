package com.jtaraya.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void testCipherEncodingReturnCorrectCipherText_True() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key = 23;
        CaesarCipher caesarCipher = new CaesarCipher();
        String output = caesarCipher.encode(plainText, key);
        System.out.println("Text output: " + output);
        assertEquals(cipherText, output);
    }

    @Test
    void testCipherDecodingReturnCorrectPlainText_True() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key = 23;
        CaesarCipher caesarCipher = new CaesarCipher();
        String output = caesarCipher.decode(cipherText, key);
        System.out.println("Text output: " + output);
        assertEquals(plainText, output);
    }
}