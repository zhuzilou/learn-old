package dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.IPersonDao;
import model.Person;

@Repository("personDao")
public class PersonDaoImpl implements IPersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable save(Person person) {
		return sessionFactory.getCurrentSession().save(person);
	}

}
