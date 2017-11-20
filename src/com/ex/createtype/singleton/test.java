package com.ex.createtype.singleton;

public class test {
	
	public static void main(String[] args){
		
//		Singleton sing1 = Singleton.getInstance();
//		Singleton sing2 = Singleton.getInstance();
//		
//		System.out.println(sing1);
//		System.out.println(sing2);
//		System.out.println(sing1==sing2);
//		System.out.println(sing1.equals(sing2));
//		
//		double i = 5/4;
//		System.out.println(i);
//		System.out.println(Math.ceil(5/4));
		GetInstance t = new GetInstance();
		GetInstance t1 = new GetInstance();
		
		t.run();
		t1.run();

	}
}

class GetInstance implements Runnable{

	@Override
	public void run() {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1);
		System.out.println(sing2);
	}
	
}
