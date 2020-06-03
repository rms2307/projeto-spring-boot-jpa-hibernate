package com.particular.projetospringbootjpahibernate.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.particular.projetospringbootjpahibernate.entities.Category;
import com.particular.projetospringbootjpahibernate.repositories.CategoryRepository;

@Service // Resgistro da classe como um componente do Spring
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
