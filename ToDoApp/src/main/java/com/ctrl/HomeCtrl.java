package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/home")
	public String home(Model m) {
		String str = "Ashwani Kumar Maurya";
		m.addAttribute("name", str);
		return "home";
	}

}
