package com.kyawzayar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.kyawzayar.pojo.EmailDTO;
import com.kyawzayar.pojo.UserDTO;
import com.kyawzayar.service.EmailServiceImpl;

@Controller
public class Email {
	
	@Autowired
	private EmailServiceImpl serviceImpl;

	@RequestMapping("/sendEmail")
	public String sendEmail(
			// @CookieValue("lcApp.userName") String userName,
			Model model) {
		// model.addAttribute("userName", userName);
		model.addAttribute("emailDTO", new EmailDTO());
//		model.addAttribute("userName", userName.toUpperCase());

		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserDTO userDTO,
			@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		serviceImpl.sendEmail(userDTO.getUserName(), emailDTO.getEmail(), "FRIEND");

		return "process-email-page";
	}

}