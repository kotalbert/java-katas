package com.example.katas.pin;

public class PinValidator {
    public static boolean validatePin(String pin) {
        return allDigits(pin) && rightLength(pin);
    }

    private static boolean rightLength(String pin) {
        return pin.length() == 4 || pin.length() == 6;
    }

    private static boolean allDigits(String pin) {
        for (char c : pin.toCharArray()) {
            if  (!Character.isDigit(c)) return false;
        }
        return true;
    }

}
