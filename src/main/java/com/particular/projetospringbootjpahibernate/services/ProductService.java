package com.particular.projetospringbootjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.particular.projetospringbootjpahibernate.entities.Product;
import com.particular.projetospringbootjpahibernate.repositories.ProductRepository;

@Service // Resgistro da classe como um componente do Spring
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
