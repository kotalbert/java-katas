package com.example.katas.pin;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PinValidatorTest {
    @Test
    public void validPins() {
        assertTrue(PinValidator.validatePin("1234"));
        assertTrue(PinValidator.validatePin("0000"));
        assertTrue(PinValidator.validatePin("1111"));
        assertTrue(PinValidator.validatePin("123456"));
        assertTrue(PinValidator.validatePin("098765"));
        assertTrue(PinValidator.validatePin("000000"));
        assertTrue(PinValidator.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(PinValidator.validatePin("a234"));
        assertFalse(PinValidator.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(PinValidator.validatePin("1"));
        assertFalse(PinValidator.validatePin("12"));
        assertFalse(PinValidator.validatePin("123"));
        assertFalse(PinValidator.validatePin("12345"));
        assertFalse(PinValidator.validatePin("1234567"));
        assertFalse(PinValidator.validatePin("-1234"));
        assertFalse(PinValidator.validatePin("1.234"));
        assertFalse(PinValidator.validatePin("00000000"));
    }
}