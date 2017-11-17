package com.ex.createtype.builder;
/**
 * Man相关的建造方法
 * @author dell
 *
 */
public class ManBuilder implements PersonBuilder {
	
	private Person person;
	
	public ManBuilder(){
		person = new Man();
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("建造Head");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造Body");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("建造foot");
	}

	@Override
	public Person BuildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
