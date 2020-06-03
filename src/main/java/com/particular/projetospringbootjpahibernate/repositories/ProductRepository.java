package com.particular.projetospringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.particular.projetospringbootjpahibernate.entities.Product;

/* Não é necessario registar a interface UserRepository como um componente do Spring, 
pois ela já herda de JpaRepository que já esta registrado como um componente do Spring*/

public interface ProductRepository extends JpaRepository<Product, Long> {

}
