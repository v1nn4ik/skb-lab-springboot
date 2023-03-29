package com.example.skblabspringboot.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ConstraintDifficulty implements ConstraintValidator<ValidDifficulty, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        List<String> easyPasswords = Arrays.asList("1234567a", "password1", "1234578q", "1q2w3e4r5t6y", "q1w2e3r4t",
                "a123456789a", "1a2b3c4d", "dragon123", "football1", "abc123456", "a111111", "birthday22");
        return !easyPasswords.contains(value);
    }
}
