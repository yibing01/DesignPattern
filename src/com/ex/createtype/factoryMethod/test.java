package com.ex.createtype.factoryMethod;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
		
		IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
		
	}

}
