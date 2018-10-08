package com.kathir.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kathir.modules.Greeting;

public class TestGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greeting gr1 =(Greeting) context.getBean("greeting1");
		
		Greeting gr2 = (Greeting )context.getBean("greeting2");
		
		Greeting gr3 = (Greeting )context.getBean("greeting3");
		
		Greeting gr4 = (Greeting )context.getBean("gr4");
		
		Greeting gr5 = (Greeting )context.getBean("gr5");
		
		System.out.println(gr1);
		System.out.println(gr2);
		System.out.println(gr3);
		System.out.println(gr4);
		System.out.println(gr5);

	}

}
