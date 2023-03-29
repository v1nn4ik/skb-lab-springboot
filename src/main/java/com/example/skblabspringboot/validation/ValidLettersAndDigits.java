package com.example.skblabspringboot.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstraintLettersAndDigits.class)
public @interface ValidLettersAndDigits {
    String message() default "The password must contain letters and digits";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
