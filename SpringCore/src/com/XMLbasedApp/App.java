package com.XMLbasedApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student student = ac.getBean("student",Student.class);
		System.out.println("student id is : "+student.getId());
		System.out.println("student name is : "+student.getName());
		System.out.println("student doorNo is : "+student.getAddress().getDoorNo());
		System.out.println("student city is : "+student.getAddress().getCity());
		System.out.println("student geographical points : "+student.getAddress().getCoOrdinates().getLatitude()+","+student.getAddress().getCoOrdinates().getLatitude());
	}

}
