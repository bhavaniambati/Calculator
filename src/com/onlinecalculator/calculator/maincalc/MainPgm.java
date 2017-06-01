package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
	int x;
	x=disp();
     if(x==1)
     {
    	 BasicCalc calc=new  BasicCalc();
    	 calc.menu();
    	 calc.userInputs();
    	 calc.performOperation();
    	 
     }
     if(x==2)
     {
    	 ScientificCalc scalc=new  ScientificCalc();
    	 scalc.menu();
    	 scalc.userInputs();
    	 scalc.performOperation();
     }
     if(x==3)
     {
    	 StatisticCalc Scalc=new  StatisticCalc();
    	 Scalc.menu();
    	 Scalc.userInputs();
    	 Scalc.performOperation();
     }
}
    static int disp(){
    	int ch;
    	Scanner s=new Scanner(System.in);
    	System.out.println("********CALCULATOR********");
    	System.out.println("********1.BASIC CALCULATOR********");
    	System.out.println("********2.SCIENTIFIC CALCULATOR********");
    	System.out.println("********3.STATISTIC CALCULATOR********");
    	System.out.println("***************************");
    	System.out.println("enter your choice");
    	ch=s.nextInt();
    	return(ch);
    }
    	
    }