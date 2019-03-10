package com.capgemini.dao;

import javax.transaction.Transactional;

import com.capgemini.bean.Person;

public interface IRepository {

	Person search(int id);

	Person createPerson(Person person);

	Person updatePerson(Person person);

	boolean deletePerson(int id);

}