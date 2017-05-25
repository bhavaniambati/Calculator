package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class conditionaloptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=(a>b?a:b);
		Scanner s=new Scanner(System.in);
		System.out.println(" biggest of two numbers is:"+c);
		c=(a<b)?(a=a+10):(b=b+10);
		System.out.println("a=="+a);
		System.out.println("b=="+b);
	}

}
