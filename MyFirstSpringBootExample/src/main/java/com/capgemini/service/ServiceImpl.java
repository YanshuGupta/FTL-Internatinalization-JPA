package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Person;
import com.capgemini.dao.IRepository;

@Service
public class ServiceImpl implements IService {

	@Autowired
	IRepository repo;
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.IService#createPerson(com.capgemini.bean.Person)
	 */
	@Override
	public Person createPerson(Person person) {
		return repo.createPerson(person);
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.IService#updatePerson(com.capgemini.bean.Person)
	 */
	@Override
	public Person updatePerson(Person person) {
		return repo.updatePerson(person);
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.service.IService#search(int)
	 */
	@Override
	public Person search(int id) {
		return repo.search(id);
	}

	/* (non-Javadoc)
	 * @see com.capgemini.service.IService#deletePerson(int)
	 */
	@Override
	public boolean deletePerson(int id) {
		return repo.deletePerson(id);
	}
	
	
}
