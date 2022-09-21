package com.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dio.config.BeanTeste;
import com.dio.service.UsersService;

@Controller
public class HomeController {
	
	@Autowired
	private UsersService userService;
	
	@Autowired
	private BeanTeste teste1;
	
	@Autowired
	private BeanTeste teste2;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		userService.buscarDadosBanco();
		
		userService.deletaDados();
		
		userService.buscarUsuariosPorId(1L);
		
		teste1.setNome("Bean Teste 1");
		
		System.out.println(teste1.getNome());
		System.out.println(teste2.getNome());
		
				model.addAttribute("mensagem", "Hello Word");
		userService.deletaDados();
		return "home";
	}

}
