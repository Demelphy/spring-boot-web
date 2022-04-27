package es.demelphy.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.demelphy.springboot.web.app.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping
	public String getUser(Model model) {
		User user = new User("Demel", "Master Phy");
		user.setEmail("demelmasterphy@mail.com");
		
		model.addAttribute("title", "User Info - "+user.getFirstName() + " " + user.getLastName());
		model.addAttribute("user", user);
		
		return "/users/user";
	}
}
