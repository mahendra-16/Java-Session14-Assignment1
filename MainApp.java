package com.springer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloWorld hw = (HelloWorld) context.getBean("HelloWorld");
		hw.getMessage();
		
	}

}
