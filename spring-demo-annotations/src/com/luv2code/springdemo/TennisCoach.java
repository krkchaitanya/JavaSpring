package com.luv2code.springdemo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	default constructor
	public TennisCoach() {
		System.out.println(">>tenniscoach: inside default contructor");
	}
	
	

	
	
//	setter injection
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">>Tenniscoach: inside setFortuneService() method");
//		fortuneService=theFortuneService;
//	}
//	
	
	
/*
 	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
*/
	
//	define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>: Tennis Coach  : inside doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach:inside of doMyCleanupStuff");
	}
	
	
	
	
	
	@Override
	public String getDailyWorkout() {
	
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
