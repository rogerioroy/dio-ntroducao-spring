package com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	

}
