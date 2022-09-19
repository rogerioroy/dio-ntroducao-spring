package com.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dio.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		userService.buscarDadosBanco();
		
		userService.deletaDados();
		
		model.addAttribute("mensagem", "Hello Word");
		userService.deletaDados();
		return "home";
	}

}
