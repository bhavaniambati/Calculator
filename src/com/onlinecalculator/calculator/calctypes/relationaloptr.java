package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class relationaloptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		System.out.println("a=b"+(a=b));
		System.out.println("a!=b"+(a!=b));
		System.out.println("a>b"+(a>b));
		System.out.println("a<b"+(a<b));
		System.out.println("a<=b"+(a<=b));
		System.out.println("a>=b"+(a>=b));
	}

}
