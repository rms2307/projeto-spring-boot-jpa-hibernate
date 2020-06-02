package com.particular.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.particular.projetospringbootjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
