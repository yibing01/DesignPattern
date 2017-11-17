package com.ex.createtype.factoryMethod;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public IWork getWork() {
		// TODO Auto-generated method stub
		return new TeacheWork();
	}

}
