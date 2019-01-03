package com.example.spring.aop.appExampleSpringAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.spring.aop.appExampleSpringAOP.service.ContactService;
import com.example.spring.aop.appExampleSpringAOP.service.impl.ContactServiceImpl;

@SpringBootApplication
public class AppExampleSpringAopApplication {

	public static void main(String[] args) {
		 ApplicationContext contexto=(ApplicationContext) SpringApplication.run(AppExampleSpringAopApplication.class,args);
		
		 ContactService contactService= contexto.getBean(ContactServiceImpl.class);
		 System.out.println(contactService.messageContact());
				 
		//SpringApplication.run(AppExampleSpringAopApplication.class, args);
	}

}

