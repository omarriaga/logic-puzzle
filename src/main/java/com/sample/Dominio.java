package com.sample;

import java.util.LinkedList;

public class Dominio {

	private String name;
	private LinkedList<Item> items;
	
	public Dominio (String name){
		this.name = name;
		items = new LinkedList<Item>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Item> getItems() {
		return items;
	}
	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}
	
	public void addItem (Item item){
		items.add(item);
	}
	
	public Item getItem(int index){
		return items.get(index);
	}
}
