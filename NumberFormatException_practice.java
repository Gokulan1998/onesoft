package com.onesoft.collection3;

public class NumberFormatException_practice {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			String a="sgh";
			int b=Integer.parseInt(a);
			
			System.out.println(a);
			
		}
		catch(NumberFormatException z) {
			System.out.println("error occurs");
		}
		
	}

}
