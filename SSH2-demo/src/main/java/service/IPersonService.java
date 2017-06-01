package service;

import java.io.Serializable;

import model.Person;

public interface IPersonService {
	void test();

	Serializable save(Person person);
}
