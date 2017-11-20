package com.ex.createtype.simplefactory;

public class OperationFactory {
	public static Operation CreateOperation(char operate){
		Operation oper = null;
		switch(operate){
		case '+':
			oper = new Add();
			break;
		case '-':
			oper = new Sub();
			break;
		case '*':
			oper = new Mul();
			break;
		case '/':
			oper = new Div();
			break;
		}
		return oper;
	}
}
