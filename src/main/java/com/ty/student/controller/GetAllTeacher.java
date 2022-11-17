package com.ty.student.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.TeacherDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Teacher;

public class GetAllTeacher {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		TeacherDao teacherDao = (TeacherDao) applicationContext.getBean("teacherDao");

		List<Teacher> teacher = teacherDao.getAllTeacher();

		for (Teacher teacher2 : teacher) {
			System.out.println("Id:" + teacher2.getId());
			System.out.println("Name:" + teacher2.getName());
			System.out.println("Subject:" + teacher2.getSubject());
			System.out.println("---------------------------");

		}
	}

}
