package com.ty.student.controller;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;

public class GetAllStudent {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentDao studentDao = (StudentDao)applicationContext.getBean("studentDao");
		
		List<Student> student = studentDao.getAllStudent();
		
		for (Student std : student) {
			System.out.println("Id:"+std.getId());
			System.out.println("Name:"+std.getName());
			System.out.println("Age:"+std.getAge());
			System.out.println("---------------------------");
			
		}	
	}

}
