package com.di.spring_di_annotation_ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TV tv = context.getBean("tv",TV.class);
		tv.volumeUp();
		tv.volumeDown();
	}
}