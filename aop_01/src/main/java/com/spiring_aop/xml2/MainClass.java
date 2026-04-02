package com.spiring_aop.xml2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config1-2.xml");
		
		Evaluation evaluation = context.getBean("evaluation",Evaluation.class);
		Circle circle = context.getBean("circle",Circle.class);
		
		evaluation.showEvlResult();
		circle.showCleResult();
		
		context.close();
	}

}
