package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class logicaloptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextBoolean();
		System.out.println("enter second number");
		b=s.nextBoolean();
		System.out.println("a&&b"+(a&&b));
		System.out.println("a||b"+(a||b));
		System.out.println("!a&&b"+!(a&&b));
		
		
	}

}
