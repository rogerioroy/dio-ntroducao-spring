package com.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.entity.Users;
import com.dio.service.UsersService;

@RestController
public class HomeRestController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping("/rest")
	public Users testeRest() {
		return service.buscarUsuariosPorId(1l);
	}

}
