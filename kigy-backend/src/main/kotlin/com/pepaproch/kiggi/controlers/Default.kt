package com.pepaproch.saltit.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController {

	@GetMapping("/")
	fun blog(model: Model): String {
		model["title"] = "Home Page"
		return "index"
	}

	}