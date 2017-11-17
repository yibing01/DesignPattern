package com.ex.createtype.builder;
/**
 * 建造一个对象并返回
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
