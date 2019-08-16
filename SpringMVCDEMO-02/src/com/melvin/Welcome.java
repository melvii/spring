package com.melvin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping(path="/")
	public String welcomepage() {
		return "welcome";
	}
	
	
}
