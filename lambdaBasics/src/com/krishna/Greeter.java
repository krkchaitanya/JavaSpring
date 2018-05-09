package com.krishna;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		HelloWorldGreeting gtng=new HelloWorldGreeting();
		greeter.greet(gtng);
		
		
//		Lamda expressions.....using greeting interface
	Greeting myLamdaFunction=()->{
			System.out.println("hello lamdaExpressions..");
		};
		
		
	
}
	
}

