package com.capgemini.service;

import com.capgemini.bean.Person;

public interface IService {

	Person createPerson(Person person);

	Person updatePerson(Person person);

	Person search(int id);

	boolean deletePerson(int id);

}