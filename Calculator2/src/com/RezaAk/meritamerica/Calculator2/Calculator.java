package com.RezaAk.meritamerica.Calculator2;




//import java.util.Scanner;

public class Calculator {
	
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	
	
	
//	Scanner double1 = new Scanner(System.in);
//	Scanner assigner = new Scanner(System.in);
//	Scanner double2 = new Scanner(System.in);
//	
	
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double num) {
		this.operandOne = num;
	}
	public double getOperandOne() {
		return operandOne;
	}

	
	
	
	public void setOperation(String operation) {
		if(operation == "+" || operation == "-" || operation == "/" || operation == "*") {
			this.operation = operation;
		}else {
			System.out.println("error");
		}
	}
	
	
	
	
	
	
	public String getOperation() {
		return operation;
	}

	public void setOperandTwo(double num2) {
		this.operandTwo = num2;
	}
	public double getOperandTwo() {
		return operandTwo;
	}

	public void performOperation() {
		if(getOperation() == "+") {
			System.out.println("Here is sum of two numbers:");
			this.result = getOperandOne() + getOperandTwo();
			
		}
		
		
		else if(getOperation() == "-"){
			System.out.println("Here is difference of two numbers:");
			this.result = getOperandOne() - getOperandTwo();
		}
		
		
		else if(getOperation() == "*"){
			System.out.println("Here is multipication of two numbers:");
			this.result = getOperandOne() * getOperandTwo();
		}
		
		
		else if(getOperation() == "/"){
			System.out.println("Here is division of two numbers:");
			this.result = getOperandOne() / getOperandTwo();
		}
		
		
		else {
			System.out.println("error");
		}
	}

	public double getResults() {
		return this.result;
	}


}