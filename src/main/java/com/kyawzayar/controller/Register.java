package com.kyawzayar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyawzayar.pojo.CommunicationDTO;
import com.kyawzayar.pojo.Phone;
import com.kyawzayar.pojo.RegisterDTO;

@Controller
public class Register {

	@RequestMapping("/reg")
	public String register(RegisterDTO reg, Model model) {
		model.addAttribute("userReg", reg);
		System.out.println("inside ShowRegist-page");

		// load the saved user data from the database
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("88888820");

		CommunicationDTO dto = new CommunicationDTO();
		dto.setPhone(phone);

		reg.setCommunicationDTO(dto);

		return "reg-page";
	}

	@RequestMapping("/reg-process")
	public String registerProcess(RegisterDTO reg, Model model) {
		model.addAttribute("reg", reg);
		System.out.println("inside process page");
		return "reg-process";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside initBinder method");
		//binder.setDisallowedFields("name");
	}
}
