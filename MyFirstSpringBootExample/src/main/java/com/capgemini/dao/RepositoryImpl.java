package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Person;

@Repository
public class RepositoryImpl implements IRepository {

	@PersistenceContext
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see com.capgemini.dao.IRepository#search(int)
	 */
	@Override
	public Person search(int id) {
		
		return entityManager.find(Person.class, id);
	}
	
	/* (non-Javadoc)
	 * @see com.capgemini.dao.IRepository#createPerson(com.capgemini.bean.Person)
	 */
	@Override
	@Transactional
	public Person createPerson(Person person) {
		if (search(person.getId()) == null) {

			entityManager.persist(person);
			return search(person.getId());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.capgemini.dao.IRepository#updatePerson(com.capgemini.bean.Person)
	 */
	@Override
	@Transactional
	public Person updatePerson(Person person) {
		if (search(person.getId()) != null) {

			Person p = entityManager.find(Person.class, person.getId());
			p.setMobileNumber(person.getMobileNumber());
			p.setName(person.getName());
			entityManager.merge(p);
			return search(person.getId());
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.capgemini.dao.IRepository#deletePerson(int)
	 */
	@Override
	@Transactional
	public boolean deletePerson(int id) {
		Person p = entityManager.find(Person.class, id);
		if(p==null) {
			return false;
		}
		entityManager.remove(p);
		return true;
	}
}
