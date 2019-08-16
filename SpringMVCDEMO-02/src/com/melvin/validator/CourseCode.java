package com.melvin.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD,ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)

public @interface CourseCode {

	
	public String  value() default "VZ";
	public String message() default "must start with vz";
	public Class<?>[] group() default {};
	public Class<? extends Payload>[] payload() default {};
	
	
}
