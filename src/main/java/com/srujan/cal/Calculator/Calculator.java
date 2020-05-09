package com.srujan.cal.Calculator;

import java.util.Scanner;


public class Calculator {
	
	
	private long first;
	private long second;

	public long getFirst() {
		return first;
	}
	public void setFirst(long first) {
		this.first = first;
	}

	public long getSecond() {
		return second;
	}
	public void setSecond(long second) {
		this.second = second;
	}
	
	public long addFun(long first, long second) {
		
		return first+second;
	}
	

	public static void main(String[] args) {
		
		
		Calculator cc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value:");
		long first = sc.nextLong();
		cc.setFirst(first);
		
		System.out.println("Enter the second value:");
		long second = sc.nextLong();
		cc.setSecond(second);
		
		System.out.println("The sum of two numbers:"+cc.addFun(first, second));

	}

}
