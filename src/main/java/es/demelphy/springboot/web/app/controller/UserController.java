package es.demelphy.springboot.web.app.controller;

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
		model.addAttribute("title", "User Info");
		model.addAttribute("user", user);
		return "/users/user";
	}
}
