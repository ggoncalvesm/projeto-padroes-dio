package com.dio.projetopadroesdio.model;

public class Carro {
	private String marca;
	private String modelo;
	private CategoriaEnum categoriaEnum;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca, String modelo, CategoriaEnum categoriaEnum) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.categoriaEnum = categoriaEnum;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public CategoriaEnum getCategoriaEnum() {
		return categoriaEnum;
	}
	
	public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
		this.categoriaEnum = categoriaEnum;
	}
	
}