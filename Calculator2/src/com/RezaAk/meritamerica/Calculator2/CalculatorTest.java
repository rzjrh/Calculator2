package com.RezaAk.meritamerica.Calculator2;
import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
	
		Calculator result = new Calculator();
		
		@SuppressWarnings("resource")
		Scanner double1 = new Scanner(System.in);
//		
//		@SuppressWarnings("resource")
//		Scanner assigner = new Scanner(System.in);
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner double2 = new Scanner(System.in);
		
		
		
		
	System.out.println("\n****Combinition****\nPlease enter your first number:");	
	result.setOperandOne(double1.nextDouble());
	result.setOperation("+");
	System.out.println("Please enter your second number (to be added to the first number:");	
	result.setOperandTwo(double1.nextDouble());
	result.performOperation();
	System.out.println(result.getResults());
	
	
	System.out.println("\n****Difference****\nPlease enter your first number:");	
	result.setOperandOne(double1.nextDouble());
	result.setOperation("-");
	System.out.println("Please enter your second number (to be added to the first number:");	
	result.setOperandTwo(double1.nextDouble());
	result.performOperation();
	System.out.println(result.getResults());
	
	
	
	System.out.println("\n****Multipication****\nPlease enter your first number:");	
	result.setOperandOne(double1.nextDouble());
	result.setOperation("*");
	System.out.println("Please enter your second number (to be added to the first number:");	
	result.setOperandTwo(double1.nextDouble());
	result.performOperation();
	System.out.println(result.getResults());
	
	
	
	System.out.println("\n****Division****\nPlease enter your first number:");	
	result.setOperandOne(double1.nextDouble());
	result.setOperation("/");
	System.out.println("Please enter your second number (to be added to the first number:");	
	result.setOperandTwo(double1.nextDouble());
	result.performOperation();
	System.out.println(result.getResults());

	}

}