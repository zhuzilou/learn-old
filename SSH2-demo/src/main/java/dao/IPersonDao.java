package dao;

import java.io.Serializable;

import model.Person;

public interface IPersonDao {
	Serializable save(Person person);
}
