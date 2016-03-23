package com.sample;

public class Item {

	private String name;
	private Dominio dominio;
	
	public Item (){}
	
	public Item (String name, Dominio dominio){
		this.name = name;
		this.dominio = dominio;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dominio getDominio() {
		return dominio;
	}
	public void setDominio(Dominio dominio) {
		this.dominio = dominio;
	}
	
	
}
