package pl.coderslab.warsztat6b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import pl.coderslab.warsztat6b.bean.SessionController;

@Controller
public class HomeController {
	@Autowired
	SessionController sc;
	
	@GetMapping("")
	public String home() {
		return "home";
	}
}
