package com.kyawzayar.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
	
	private int lower;
	private int upper;
	
	// Don't need 
	public void initialize(Age age) {
		// TODO Auto-generated method stub
		// ConstraintValidator.super.initialize(constraintAnnotation);
		this.lower = age.lower();
		this.upper = age.upper();
	}
	
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (age == null) {
			return false;
		}
		if (age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
