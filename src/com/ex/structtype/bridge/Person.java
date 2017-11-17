package com.ex.structtype.bridge;

public abstract class Person {
	
	private Clothing clothing;
	
	private String type;
	
	public Clothing getClothing(){
		return clothing;
	}
	
	public void setClothing(){
		this.clothing = null;
	}
	
}
