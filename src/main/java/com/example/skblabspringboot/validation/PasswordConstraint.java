package com.example.skblabspringboot.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraint implements ConstraintValidator<ValidPassword, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        var hasDigits = false;
        var hasLetters = false;
        for (int i = 0; i < value.length(); i++) {
            var currentChar = value.charAt(i);
            if (Character.isDigit(currentChar)) {
                hasDigits = true;
            }
            else if (Character.isLetter(currentChar)) {
                hasLetters = true;
            }
        }
        return hasLetters && hasDigits;
    }
}
