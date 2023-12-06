package com.tarea.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.tarea.entity.Vehiculos;
import com.tarea.tarea.service.VehiculosService;

@RestController
public class VehiculosController {
    
    @Autowired
    VehiculosService vehiS;


    @GetMapping("/lista1")
	public List<Vehiculos> verTodo() {
		return vehiS.listar();
	}

	@GetMapping("/lista/{id}")
	public Vehiculos verUno(@PathVariable Long id) {
		return vehiS.verUno(id);
	}

	@PostMapping("/registrar")
	public Vehiculos registar(@RequestBody Vehiculos vehiculos){
		return vehiS.registrar(vehiculos);
	}

	@PutMapping("/actualizar/{id}")
	public Vehiculos actualizar(@RequestBody Vehiculos vehiculos, @PathVariable Long id){
		return vehiS.actualizar(vehiculos,id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		vehiS.eliminar(id);
	}
}
