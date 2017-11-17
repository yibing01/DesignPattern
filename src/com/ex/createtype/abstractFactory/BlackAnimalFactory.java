package com.ex.createtype.abstractFactory;

public class BlackAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		// TODO Auto-generated method stub
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		// TODO Auto-generated method stub
		return new BlackDog();
	}

}
