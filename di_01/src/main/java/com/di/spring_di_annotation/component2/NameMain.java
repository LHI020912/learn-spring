package com.di.spring_di_annotation.component2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-config3.xml");
		
		NameController controller = context.getBean("nameController",NameController.class);
		controller.show("양정원");
		context.close();
	}
}
