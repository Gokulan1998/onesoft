package com.onesoft.collection3;

public class MultiCatch_practice {

	public static void main(String[] args) {
		try {
			String[] a= {"Nish","kumar","pratip"};
			System.out.println(a[6].charAt(4));
		}
		catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(RuntimeException ae) {
			ae.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("error found");

	}

}
