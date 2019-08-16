package com.melvin.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy =  PrimeNumber.class )
@Target( { ElementType.METHOD,ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)

public @interface seed {
	public String  value() default "";
	public String message() default "not a prime number";
	public Class<?>[] group() default {};
	public Class<? extends Payload>[] payload() default {};
	

}
