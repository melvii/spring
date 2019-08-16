package com.melvin.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	implements ConstraintValidator<CourseCode,String>{

	
	private String coursePrefix;
	public void initialize(CourseCode thecourseCode) {
		coursePrefix=thecourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		
		
		
		return (theCode!=null)?theCode.startsWith(coursePrefix):true;
	}
	

}
