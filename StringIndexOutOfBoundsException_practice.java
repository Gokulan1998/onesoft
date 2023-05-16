package com.onesoft.collection3;

public class StringIndexOutOfBoundsException_practice {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			String[] a=new String[] {"aa","bb","cc"};
			System.out.println(a[2].charAt(3));
			
			
		}
		catch(StringIndexOutOfBoundsException g) {
			System.out.println("error occurs");
		}
		System.out.println("end");

	}

}
