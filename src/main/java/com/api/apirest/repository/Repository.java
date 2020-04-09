package com.api.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apirest.models.Model;

public interface Repository extends JpaRepository<Model, Long>{
	
	Model findById(long id);

}
