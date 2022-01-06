package com.kyawzayar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kyawzayar.pojo.UserDTO;
import com.kyawzayar.propertyeditor.NamePropertyEditor;
import com.kyawzayar.validator.UserNameValidator;

@Controller
@SessionAttributes({"userInfo"} )
public class LoveCalculator {
	@Autowired
	private UserNameValidator validator;

	@RequestMapping("/")
	public String homePage(HttpServletRequest request, Model model) {
		model.addAttribute("userInfo", new UserDTO());
		
		// For Cookie
//		Cookie[] cookies = request.getCookies();
//		for (Cookie cookie : cookies) {
//			if ("lcApp.userName".equals(cookie.getName())) {
//				String userName = cookie.getValue();
//				user.setUserName(userName);				
//			}
//		}

		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String resultPage(@Valid @ModelAttribute("userInfo") UserDTO user, BindingResult result,
			HttpServletRequest request) {
		
		
		
		// System.out.println(user.getAge());
		// System.out.println(user.getEg());
		System.out.println(user.getCrushName());
		System.out.println(user.getUserName());

		validator.validate(user, result);

		if (result.hasErrors()) {
			System.out.println("my form has error");

			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError temp : errors) {
				System.out.println(temp);
			}
			return "home-page";
		}

		// create Cookie
//		Cookie theCookie = new Cookie("lcApp.userName", user.getUserName());
//		theCookie.setMaxAge(60*60*24);
//		response.addCookie(theCookie);
		// For Session
//		HttpSession session = request.getSession();
//		session.setAttribute("userName", user.getUserName());
//		session.setAttribute("crushName", user.getCrushName());
		return "result-page";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside the init binder");
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		// binder.registerCustomEditor(String.class, "eg", editor);
		binder.registerCustomEditor(String.class, editor);

		NamePropertyEditor editor2 = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "eg", editor2);
		// binder.registerCustomEditor(String.class, editor2);

		// binder.addValidators(new UserNameValidator());
	}
}
