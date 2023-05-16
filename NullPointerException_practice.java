package com.onesoft.collection3;

public class NullPointerException_practice {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a=0;
			String b=null;
			System.out.println(b.charAt(0));
		}
		catch(NullPointerException x) {
			System.out.println("error occurs");
			
		}
		System.out.println("End");
		
	}

}
