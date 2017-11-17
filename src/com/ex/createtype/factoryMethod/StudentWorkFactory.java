package com.ex.createtype.factoryMethod;

public class StudentWorkFactory implements IWorkFactory {

	@Override
	public IWork getWork() {
		// TODO Auto-generated method stub
		return new StudentWork();
	}

}
