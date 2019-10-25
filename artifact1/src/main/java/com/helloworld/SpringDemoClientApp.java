package com.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.service.SpringFirstTest;

public class SpringDemoClientApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SpringFirstTest obj = (SpringFirstTest) context.getBean("springTest");
		obj.serviceMethod();
	}

}
