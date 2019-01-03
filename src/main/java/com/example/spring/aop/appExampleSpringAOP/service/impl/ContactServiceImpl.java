package com.example.spring.aop.appExampleSpringAOP.service.impl;

import org.springframework.stereotype.Service;

import com.example.spring.aop.appExampleSpringAOP.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

		
	@Override
	public String messageContact() {		
		return "message contact";
	}

}
