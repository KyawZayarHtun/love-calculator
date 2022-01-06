package com.kyawzayar.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.kyawzayar.pojo.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse method of PhoneNumberFormatter");
		 // split the String received from user String[] phoneNumberArray =
		 String[] phoneNumberArray = completePhoneNumber.split("-");
		 Phone phone = new Phone();
		 int index = completePhoneNumber.indexOf("-");
		 if (index == -1) {
				// extract the country code and setCountryCode Phone phone = new Phone();
				phone.setCountryCode("91");
				phone.setUserNumber(phoneNumberArray[0]);

		} else {
			// extract the country code and setCountryCode Phone phone = new Phone();
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);

		}
		 
		 
		
//		System.out.println(phoneNumberArray);

		return phone;
	}



}
