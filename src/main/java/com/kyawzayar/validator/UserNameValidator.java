package com.kyawzayar.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kyawzayar.pojo.UserDTO;

@Component
public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User Cannnot");
//		String userName = ((UserDTO) target).getUserName();
//		if (!userName.contains("_")) {
//			errors.rejectValue("userName", "userName.invalidString", "Must contain '_' ");
//		}
//		
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "crushName", "crushName.empty", "crushName Cannnot");
//		String crushName = ((UserDTO) target).getCrushName();
//		if (!crushName.endsWith("hola.com")) {
//			errors.rejectValue("crushName", "crushName.invalidString", "Must end with hola.com ");
//		}
	}

}
