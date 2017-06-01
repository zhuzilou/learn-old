package service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IPersonDao;
import model.Person;
import service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonDao personDao;

	@Override
	public void test() {
		System.out.println("Enter service success.");
	}

	@Override
	public Serializable save(Person person) {
		return personDao.save(person);
	}
}
