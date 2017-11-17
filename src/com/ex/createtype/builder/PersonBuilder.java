package com.ex.createtype.builder;
/**
 * 需建造对象的接口
 * @author dell
 *
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person BuildPerson();
}
