package com.confignyh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
//		configuring java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

//		getting bean
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
