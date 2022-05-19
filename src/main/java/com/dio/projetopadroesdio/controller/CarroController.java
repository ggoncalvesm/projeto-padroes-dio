package com.dio.projetopadroesdio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dio.projetopadroesdio.dao.CarroDao;
import com.dio.projetopadroesdio.model.Carro;
import com.dio.projetopadroesdio.model.CategoriaEnum;

@RestController
public class CarroController {
	
	private CarroDao dao = CarroDao.getInstance();
	
	@GetMapping("/save")
	public boolean save(@RequestParam String marca, @RequestParam String modelo, @RequestParam String categoria) {
		Carro carro = new Carro(marca, modelo, CategoriaEnum.valueOf(categoria));
		dao.save(carro);
		return true;
	}
	
	@GetMapping("/getAll")
	public List<Carro> getAll(){
		return dao.getAll();
	}
	
	@DeleteMapping("/delete")
	public boolean delete(@RequestParam int index) {
		return dao.remove(index);
	}
	
	@PutMapping("/put/{index}")
	public boolean put(@PathVariable int index, @RequestBody Carro carro) {
		return dao.put(index, carro);
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Teste";
	}
}
