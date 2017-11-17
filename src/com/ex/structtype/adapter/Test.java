package com.ex.structtype.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target target = new Adapter(new Adaptee());
//		target.adapteeMethod();
//		target.adapterMethod();
		
		Target target1 = new Adapter(new NewAdapteeImpl());
		target1.adapteeMethod();
		target1.adapterMethod();
	}

}
