package com.api.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apirest.models.Model;

@RestController
@RequestMapping(value="/api")
public class Resource{
	
	private List<Model> modelo;
	
	@GetMapping("/modelos")
	private List<Model> ListaMedidores(){
		
		modelo = new ArrayList<Model>();
		
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
		modelo.add(new Model("Zeus","Zeus 8023"));
		
		return modelo;
	}
	
}


