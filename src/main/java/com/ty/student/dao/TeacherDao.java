package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.student.dto.Student;
import com.ty.student.dto.Teacher;

@Component
public class TeacherDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

		public Teacher saveTeacher(Teacher teacher) {
			
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(teacher);

		entityTransaction.commit();

		return teacher;

	}
	
	
	public List<Teacher> getAllTeacher() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		String jpql = "Select s from Teacher s";
		Query q = entityManager.createQuery(jpql);

		List<Teacher> ls = q.getResultList();
		return ls;

	}
	
	public boolean deleteTeacherByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = entityManager.find(Teacher.class, id);

		if (teacher != null) {

			entityTransaction.begin();

			entityManager.remove(teacher);

			entityTransaction.commit();
			return true;
		}

		return false;

}
	public Teacher updateTeacherByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher teacher = entityManager.find(Teacher.class, id);

		if (teacher != null) {

			entityTransaction.begin();

			entityManager.merge(teacher);

			entityTransaction.commit();
			
			return teacher;
		}

		return null;

	}

	public Teacher getTeacherByID(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, id);

		if (teacher != null) {

			return teacher;
		}

		return null;

	}

}
