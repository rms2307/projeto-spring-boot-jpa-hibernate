package com.particular.projetospringbootjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.particular.projetospringbootjpahibernate.entities.Order;
import com.particular.projetospringbootjpahibernate.repositories.OrderRepository;

@Service // Resgistro da classe como um componente do Spring
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
