package com.onesoft.collection3;

public class CheckName 
{
	public static void main(String[] args) //thows exception 
	{
	String name1="Nisha";
	String name2="kumar";
	try {
		if(name1.equals(name2)) {
			System.out.println("same");
		}
		else {
			throw new NameException("not equals");
		}
	
	}
	catch(NameException a) {
		System.out.println(a);
	}
	System.out.println("end");
}


}
