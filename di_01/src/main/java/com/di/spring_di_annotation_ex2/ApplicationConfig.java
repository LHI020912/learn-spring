package com.di.spring_di_annotation_ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Speaker speaker() {
		Speaker speaker = new Speaker();
		return speaker;
	}
	
	@Bean
	public TV tv() {
		TV tv = new TV();
		tv.setSpeaker(speaker());
		return tv;
	}
	
}
