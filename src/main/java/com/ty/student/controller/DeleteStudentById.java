package com.ty.student.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.student.dao.StudentDao;
import com.ty.student.dto.MyConfig;
import com.ty.student.dto.Student;

public class DeleteStudentById {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		StudentDao studentDao = (StudentDao)applicationContext.getBean("studentDao");
		
		 studentDao.deleteStudentByID(1);

}
}
