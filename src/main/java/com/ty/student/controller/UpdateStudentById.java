package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;

public class UpdateStudentById {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentDao dao = (StudentDao)applicationContext.getBean("studentDao");
		
		Student student = dao.updateStudentByID(3);
		
		student.setId(3);
		student.setName("Kavin");
		student.setAge(23);
		
		System.out.println("Updated");
	
	}

}
