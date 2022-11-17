package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.student.dto.Student;

@Component
public class StudentDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	
		public Student saveStudent(Student student) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(student);

		entityTransaction.commit();

		return student;

	}

	public List<Student> getAllStudent() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		String jpql = "Select s from Student s";
		Query q = entityManager.createQuery(jpql);

		List<Student> ls = q.getResultList();
		return ls;

	}

	public boolean deleteStudentByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);

		if (student != null) {

			entityTransaction.begin();

			entityManager.remove(student);

			entityTransaction.commit();
			return true;
		}

		return false;

	}

	public Student updateStudentByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = entityManager.find(Student.class, id);

		if (student != null) {

			entityTransaction.begin();

			entityManager.merge(student);

			entityTransaction.commit();
			
			return student;
		}

		return null;

	}

	public Student getStudentByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, id);

		if (student != null) {

			return student;
		}

		return null;

	}

}
