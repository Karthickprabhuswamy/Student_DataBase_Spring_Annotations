package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;

public class SaveStudent {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		Student student = (Student) applicationContext.getBean("student");

		student.setName("Pavan");

		student.setAge(26);

		StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");

		dao.saveStudent(student);

	}

}
