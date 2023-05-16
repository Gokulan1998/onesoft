package com.onesoft.collection3;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("start");
		String name="gokul";
		try {
			System.out.println(name.charAt(6));
			
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("error occurs");
		}
		finally {
			System.out.println("welcome");
		}
		System.out.println("end");
	}

}
