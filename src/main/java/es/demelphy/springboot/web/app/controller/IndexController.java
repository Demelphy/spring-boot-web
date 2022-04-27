package es.demelphy.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {

	@GetMapping({"/index", "/", "", "home"})
	public String index(Model model) {
		model.addAttribute("title", "Welcome");
		return "index";
	}
}
