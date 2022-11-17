package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;

public class GetStudentById {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		StudentDao dao = (StudentDao) applicationContext.getBean("studentDao");

		Student std = dao.getStudentByID(2);

		System.out.println("ID:" + std.getId());
		System.out.println("Name:" + std.getName());
		System.out.println("Age:" + std.getAge());

	}

}
