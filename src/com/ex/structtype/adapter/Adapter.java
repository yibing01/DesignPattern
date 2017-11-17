package com.ex.structtype.adapter;

public class Adapter implements Target {

	private Adaptee adaptee;
	private NewAdaptee newAdaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	public Adapter(NewAdaptee newAdaptee){
		this.newAdaptee = newAdaptee;
	}
	
	@Override
	public void adapteeMethod() {
		// TODO Auto-generated method stub
		//	adaptee.adapteeMethod();
		newAdaptee.adapteeMethod();
	}

	@Override
	public void adapterMethod() {
		// TODO Auto-generated method stub
		System.out.println("Adapter method!");
	}

}
