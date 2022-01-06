/**
 * 
 */
package com.kyawzayar.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
/**
 * @author Kyaw Zayar
 *
 */
public @interface Age {
	
	//String message() default "Age should be between {lower}-{upper}";
	String message() default "{invalidbra}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int lower() default 18;

	int upper() default 60;
}
