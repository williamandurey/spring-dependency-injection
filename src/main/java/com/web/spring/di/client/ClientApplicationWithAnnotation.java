package com.web.spring.di.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.spring.di.configuration.DIConfiguration;
import com.web.spring.di.consumer.MyApplicationWithAnnotation;

public class ClientApplicationWithAnnotation {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplicationWithAnnotation app = context.getBean(MyApplicationWithAnnotation.class);
		app.processMessage("Annotation based injection", "spring@william.com");
		context.close();
	}
	
}
