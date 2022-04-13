package com.wipro.calculator;

import java.util.Scanner;

public class Calculator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int noOne,noTwo;
	System.out.println("enter frst number");
	noOne=sc.nextInt();
	System.out.println("Enter second  number");
	noTwo=sc.nextInt();
	System.out.println("The result is:");
	int result=noOne+noTwo;
	System.out.println(result);
	System.out.println("hii");
	
}
}
