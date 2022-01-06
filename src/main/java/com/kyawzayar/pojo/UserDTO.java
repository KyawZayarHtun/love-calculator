package com.kyawzayar.pojo;

import javax.validation.constraints.AssertTrue;

public class UserDTO {

	// @NotBlank(message = "dont be blank like u")
	// @Size(min = 3, max = 15, message = "Really You name have only 3 chrater \n or
	// more than 15?")
	private String userName;

	// @NotBlank(message = "dont be blank like u and that's why you dont have GF")
	// @Size(min = 3, max = 15, message = "Really Your crush name have only 3
	// chrater \n or more than 15? what is she alian?")
	private String crushName;

	// @Age(lower = 20, upper = 70)
	// private Integer age;

	@AssertTrue(message = "you better agree!!")
	private boolean termsAndCond;

	// @NotBlank(message = "not balnk bro")
	// private String eg;

	public boolean isTermsAndCond() {
		return termsAndCond;
	}

	public void setTermsAndCond(boolean termsAndCond) {
		this.termsAndCond = termsAndCond;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	// public Integer getAge() { return age; }

	// public void setAge(Integer age) { this.age = age; }

	// public String getEg() { return eg; }

	// public void setEg(String eg) { this.eg = eg; }

}
