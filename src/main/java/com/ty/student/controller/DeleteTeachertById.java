package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.TeacherDao;
import com.ty.student.dto.MyConfig;

public class DeleteTeachertById {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		TeacherDao teacherDao = (TeacherDao) applicationContext.getBean("teacherDao");

		teacherDao.deleteTeacherByID(1);

	}

}
