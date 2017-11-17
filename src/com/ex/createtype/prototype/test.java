package com.ex.createtype.prototype;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtoType pro = new ConcreateProtoType("prototype");
		ProtoType pro2 = (ProtoType) pro.clone();
		
		System.out.println(pro.getName());
		System.out.println(pro2.getName());
		System.out.println(pro == pro2);
		System.out.println(pro.equals(pro2));
		System.out.println(pro.getName().toString().equals(pro2.getName().toString()));

	}

}
