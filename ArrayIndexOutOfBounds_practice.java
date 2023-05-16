package com.onesoft.collection3;

public class ArrayIndexOutOfBounds_practice {

	public static void main(String[] args) {
		System.out.println("start");
		try {
			int[] a=new int[] {1,2,3,4};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException x) {
			System.out.println("error occurs");
		}
		System.out.println("end");
		

	}

}
