package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dao.TeacherDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;
import com.ty.student.dto.Teacher;

public class UpdateTeacherById {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		TeacherDao teacherDao = (TeacherDao) applicationContext.getBean("teacherDao");
		
		Teacher teacher = teacherDao.updateTeacherByID(2);
		teacher.setId(3);
		teacher.setName("Kavin");
		teacher.setSubject("Science");
		
		System.out.println("Updated");
	
	}

}
