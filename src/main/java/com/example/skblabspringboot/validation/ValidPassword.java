package com.example.skblabspringboot.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {})
@Size(min = 8, max = 40, message = "Password must be between 8 and 40 characters")
@NotBlank
@ValidLettersAndDigits
@ValidDifficulty
public @interface ValidPassword {
    String message() default "The password is not correct";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}

