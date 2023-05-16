package com.onesoft.collection3;

public class ArithmeticException_demo1 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a=12;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException z) {
			System.out.println("Error occurs");
			
		}
		System.out.println("End");
	}

}
