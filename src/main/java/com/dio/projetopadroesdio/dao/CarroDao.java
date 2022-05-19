package com.dio.projetopadroesdio.dao;

import java.util.ArrayList;
import java.util.List;

import com.dio.projetopadroesdio.model.Carro;

public class CarroDao {
	
	private static CarroDao dao;
	private ArrayList<Carro> listaCarros;
	
	private CarroDao() {
		 listaCarros = new ArrayList<Carro>();
	}
	
	public static CarroDao getInstance() {
		if(dao == null) {
			dao = new CarroDao();	
		}
		return dao;
	}
	
	public synchronized void save(Carro carro) {
		listaCarros.add(carro);
	}
	
	public List<Carro> getAll(){
		return listaCarros;
	}
	
	public boolean remove(int index) {
		if(index < listaCarros.size()) {
			listaCarros.remove(index);
			return true;
		}
		return false;
	}
	
	public boolean put(int index, Carro carro) {
		if(index < listaCarros.size()) {
			listaCarros.remove(index);
			listaCarros.add(index, carro);
			return true;
		}
		return false;
	}
	
}