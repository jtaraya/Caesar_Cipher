package com.jtaraya.util;

import com.jtaraya.models.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void isValid() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));

    }
}