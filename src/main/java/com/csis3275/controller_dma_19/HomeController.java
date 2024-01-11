package com.csis3275.controller_dma_19;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String renderHomePage() {
		return "homeView";
	}

}
