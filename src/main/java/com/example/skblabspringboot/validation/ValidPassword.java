package com.example.skblabspringboot.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordConstraint.class)
public @interface ValidPassword {
    String message() default "The password must contain letters and digits";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
