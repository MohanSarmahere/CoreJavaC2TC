package com.tns.lambdademo;



@FunctionalInterface
interface Operator2 {
public int operate(int num1,int num2);
}



public class OperatorDemo2 {
	 public static void main(String[] args) {
	  Operator2 op = (num1,num2) -> num1+num2;
	  int sum = op.operate(10,20);
	  System.out.println("sum:"+sum);
	 
	  Operator2 op2 = (num1,num2) -> num1-num2;
	  int difference = op2.operate(25, 10);
	  System.out.println("Difference:"+difference);
	 }
	}

	

