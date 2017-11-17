package com.ex.createtype.builder;
/**
 * Man��صĽ��췽��
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
		person.setHead("����Head");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("����Body");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("����foot");
	}

	@Override
	public Person BuildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
