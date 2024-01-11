package com.csis3275.controller_dma_19;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//Import the model
import com.csis3275.model_dma_19.Greeting_dma_19;

@Controller
public class GreetingController_dma_19 {
	
	@GetMapping("/greetingGetRoute")
	public String greetingForm(Model model) {
		model.addAttribute("greetingModelAttribute", new Greeting_dma_19());
		return "greetingView";
	}

	@PostMapping("/greetingPostRoute")
	public String greetingSubmit(@ModelAttribute Greeting_dma_19 greeting, Model model) {

		model.addAttribute("greetingModelAttribute", greeting);
		return "resultView";
	}
}
