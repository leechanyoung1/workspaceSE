package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
	
		int result1=calculator.add(23,34);
		System.out.println(result1);
		int result2=calculator.sub(23,34);
		System.out.println(result2);
		int result3=calculator.mul(23,34);
		System.out.println(result3);
		double result4=calculator.div(45435,34);
		System.out.printf("%.2f",result4);
		
		
	}

}
