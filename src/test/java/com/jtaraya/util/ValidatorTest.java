package com.jtaraya.util;

import com.jtaraya.models.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void testInvalidOperation_validatorReturnsFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));

    }

    @Test
    void testInvalidMessage_validatorReturnsFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));

    }

    @Test
    void testInvalidKey_validatorReturnsFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));

    }

    @Test
    void testValidOnValidUserInput_validatorReturnsTrue() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertTrue(validator.isValid(userInput));

    }
}