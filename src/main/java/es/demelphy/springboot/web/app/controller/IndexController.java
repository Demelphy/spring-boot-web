package es.demelphy.springboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController extends BaseController {

	@Value("${indexController.index.title}")
	private String indexTitle;
	
	@GetMapping({"/index", "/", "", "home"})
	public String index(Model model) {
		model.addAttribute("title", "Welcome");
		return "index";
	}
	
	@GetMapping("/rp-single")
	public String requestParamSingle(@RequestParam String text, Model model) {
		model.addAttribute("result", "The text is: " + text);
		model.addAttribute("title", "Single Request Param");
		
		return "/rp/rp-single";
	}
	
	@GetMapping("/rp-mixed")
	public String requestParamMixed(@RequestParam String firstName, @RequestParam String lastName, Model model) {
		model.addAttribute("result", "Hi hi " + firstName + " " + lastName);
		model.addAttribute("title", "Mixed Request Param");
		
		return "/rp/rp-mixed";
	}
	
	@GetMapping("/pv-single/{text}")
	public String pathVariableSingle(@PathVariable String text, Model model) {
		model.addAttribute("result", "Saying: " + text);
		model.addAttribute("title", "Single Path Variable");
		
		return "/pv/pv-single";
	}
	
	@GetMapping("/pv-mixed/{firstName}/{lastName}")
	public String pathVariableMixed(@PathVariable String firstName, @PathVariable String lastName, Model model) {
		model.addAttribute("result", "Hello " + firstName + " " + lastName);
		model.addAttribute("title", "Mixed Path Variable");
		
		return "/pv/pv-mixed";
	}
}
