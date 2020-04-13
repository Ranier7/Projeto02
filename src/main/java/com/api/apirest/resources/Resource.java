package com.api.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.models.Model;
import com.api.apirest.repository.Repository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Ranier")
@CrossOrigin(origins="*")
public class Resource{
	
	//private List<Model> modelo;
	
	@Autowired
	Repository repository;
	
	@GetMapping("/modelos")
	@ApiOperation(value="Consultar todos")
	public List<Model> ListaMedidores(){
		
		/*modelo = new ArrayList<Model>();
		
		modelo.add(new Model("Apolo","Apolo 6031"));
		
		modelo.add(new Model("Cronos","Cronos 6001-A"));
		modelo.add(new Model("Cronos","Cronos 6021-A"));
		modelo.add(new Model("Cronos","Cronos 6021L"));
		modelo.add(new Model("Cronos","Cronos 6003"));
		modelo.add(new Model("Cronos","Cronos 7023"));
		modelo.add(new Model("Cronos","Cronos 7023L"));
		modelo.add(new Model("Cronos","Cronos 7023 2,5"));
		
		modelo.add(new Model("Ares","Ares 7021"));
		modelo.add(new Model("Ares","Ares 7031"));
		modelo.add(new Model("Ares","Ares 7023"));
		modelo.add(new Model("Ares","Ares 8023"));
		modelo.add(new Model("Ares","Ares 8023 15"));
		modelo.add(new Model("Ares","Ares 8023 200"));
		
		modelo.add(new Model("Zeus","Zeus 8021"));
		modelo.add(new Model("Zeus","Zeus 8031"));
		modelo.add(new Model("Zeus","Zeus 8023"));*/
		
		return repository.findAll();
	}
	
	@GetMapping("/modelos/{id}")
	@ApiOperation(value="Consultar por ID")
	public Model listaMedidoresUnico(@PathVariable(value="id") long id){
		return repository.findById(id);
	}
	
	@PostMapping("/modelo")
	@ApiOperation(value="Adicionar")
	public Model salvaModel(@RequestBody Model model) {
		return repository.save(model);
	}
	
}


