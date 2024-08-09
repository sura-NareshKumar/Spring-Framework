package com.annotationBasedApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Configurations.class);
		Employee employee = ac.getBean("employee",Employee.class);
		System.out.println("Employee id is "+employee.getId());
		System.out.println("Employee name is "+employee.getName());
		System.out.println("Employee role is "+employee.getDepartment().getRole());
		System.out.println("Employee domain is "+employee.getDepartment().getDomain());
	}

}
