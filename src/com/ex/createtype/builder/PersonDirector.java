package com.ex.createtype.builder;
/**
 * ����һ�����󲢷���
 * @author dell
 *
 */
public class PersonDirector {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.BuildPerson();
	}
}
