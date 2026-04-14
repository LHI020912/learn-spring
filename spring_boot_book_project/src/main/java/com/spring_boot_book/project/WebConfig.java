package com.spring_boot_book.project;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registory) {
		registory.addResourceHandler("/book_images/**").addResourceLocations("file:///D:/springbootWorkspace/book_images/");
	}
}
