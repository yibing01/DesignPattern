package com.ex.createtype.abstractFactory;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimalFactory animalFactory = new WhiteAnimalFactory();
		ICat whiteCat = animalFactory.createCat();
		IDog whiteDog = animalFactory.createDog();
		whiteCat.eat();
		whiteDog.eat();
		
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackCat.eat();
		blackDog.eat();
	}

}
