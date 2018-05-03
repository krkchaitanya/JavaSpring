package com.luv2code.springDemo;

public class BaseballCoach implements Coach {
	
//	define private field for dependency
	private FortuneService fortuneService;
	
//	define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
