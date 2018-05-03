package com.confignyh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
//		email and team
		System.out.println(">>email.."+theCoach.getEmail());
		System.out.println(">>team.."+theCoach.getTeam());
		
		context.close();

	}

}
