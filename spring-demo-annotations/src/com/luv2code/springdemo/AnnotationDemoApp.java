package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
//		read config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		get the bean from spring container.....bean id
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\n Pointing to the same object: "+result);
		
		
//		call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
//		call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
//		close the context
		context.close();

	}

}
