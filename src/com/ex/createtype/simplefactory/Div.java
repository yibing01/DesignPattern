package com.ex.createtype.simplefactory;

public class Div extends Operation {

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		if(numB == 0){
			System.out.println("��������Ϊ0��");
			return -1;
		}
		return numA / numB;
	}

}
