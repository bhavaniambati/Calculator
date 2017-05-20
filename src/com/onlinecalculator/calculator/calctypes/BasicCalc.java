package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

public class BasicCalc
{
	int a,b,ch,res;
	
	public  BasicCalc(){
}
	public int menu()
        {
		System.out.println("select option");
		
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("**********");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("addition");
		res=add();
		System.out.println(res);
		break;
		case 2:System.out.println("subtraction");
		res=subtract();
		System.out.println(res);
		break;		
		case 3:System.out.println("multiplication");
		res=multiply();
		System.out.println(res);
		break;		
		case 4:System.out.println("division");
		res=divide();
		System.out.println(res);
		break;		
		default:System.out.println("invalid choice.....please try again");
	}
		return ch;}
	
    public void userInputs()
    {
    	Scanner S=new Scanner(System.in);
    	System.out.println("enter first number");
    	a=S.nextInt();
    	System.out.println("enter second number");
    	b=S.nextInt();
    	
    	
    }

    public void performOperation()
{
    	
        }
       
    
    
	int add()
	{
		res=a+b;
		return res;
	}
	
	int subtract()
	{
		res=a-b;
	return res;
	}
	
	int multiply()
	{
		res=a*b;
	return res;
	}
	
	int divide()
	{
		res=a/b;
    return res;
	}
	
}