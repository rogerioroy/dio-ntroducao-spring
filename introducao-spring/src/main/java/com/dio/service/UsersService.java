package com.dio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.entity.Users;
import com.dio.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository userRepository;
	
	public List<String> buscarDadosBanco() {
		List<String> nomes = new ArrayList<>();
		System.out.println("Chamou o metodo de buscar");
		return nomes;
	}
	
	public void deletaDados() {
		System.out.println("Chamou o metodo de deletar");
//		userRepository.deleteById(1L);
	}
	
	public Users buscarUsuariosPorId(long id) {
		Users users = new Users();
		users.setName("Rogerio");
		
		userRepository.save(users);
		
		return userRepository.findById(id).get();
	}

}
