package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dao.TeacherDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;
import com.ty.student.dto.Teacher;

public class SaveTeacher {
	
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);


		Teacher teacher = (Teacher)applicationContext.getBean("teacher");

		teacher.setName("Pavan");

		teacher.setSubject("Maths");

		TeacherDao teacherDao = (TeacherDao) applicationContext.getBean("teacherDao");

		teacherDao.saveTeacher(teacher);
		

	}

}
