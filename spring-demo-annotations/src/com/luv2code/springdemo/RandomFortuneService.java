package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	
//	create array of strings
	private String[] data= {
			"Beware of the wolf in the clothing",
			"Diligence is the mother of good luck",
			"The jorney is the reward"
	};
	
//	random no generator
	private Random myRandom=new Random();
	
	
	@Override
	public String getFortune() {
//		pick a random string
		int index=myRandom.nextInt(data.length);
		
		String theFortune=data[index];
		
		return theFortune;
	}
	
	
	
	
}
