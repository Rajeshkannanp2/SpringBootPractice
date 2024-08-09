package com.rajesh.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rajesh.main.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImp implements StudentDAO{

	//define field for entity manager
	
	private EntityManager entityManager;
	
	//inject entity manger to constructor using constructor injection
	
	@Autowired
	public StudentDAOImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	//implement save method
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		entityManager.persist(theStudent);
	}

	@Override
	public Student findById(Integer id) {
		return entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		// create query
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
		//return query results
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByLastName(String LastName) {
		// create query
		TypedQuery<Student> findByLastNameQuery = entityManager.createQuery("From Student Where lastName=:LastName", Student.class);
		//set query parameter
		findByLastNameQuery.setParameter("LastName", LastName);
		//return value
		return findByLastNameQuery.getResultList();
	}

	@Override
	@Transactional
	public void updateLastName(Student theStudent) {
		entityManager.merge(theStudent);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) { 
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}

	@Override
	@Transactional
	public int deleteAll() {
		int noOfDeletedRow = entityManager.createQuery("Delete from Student", Student.class).executeUpdate();
		
		return noOfDeletedRow;
	}
	
}
