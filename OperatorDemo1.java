package com.tns.lambdademo;


@FunctionalInterface
interface Operator1 {
 public int operate(int num1,int num2);
}
	public class OperatorDemo1 {
		public static void main(String[] args) {
			Operator1 op = (num1,num2) -> num1+num2;
			int sum = op.operate(10,20);
			System.out.println("sum:"+sum);
}
}

