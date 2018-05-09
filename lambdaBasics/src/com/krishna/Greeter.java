package com.krishna;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		HelloWorldGreeting gtng=new HelloWorldGreeting();
		greeter.greet(gtng);
		
		
//		Lambda expressions.....using greeting interface
	Greeting myLambdaFunction=()->{
			System.out.println("hello lamdaExpressions..");
		};
		myLambdaFunction.perform();
		
	
}
	
}

