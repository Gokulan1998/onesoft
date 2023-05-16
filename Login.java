package com.onesoft.collection3;

public class Login  {
	public void checkpass(String password) throws Exception {
	if(password.length()<8) {
		try {
			throw new Exception("password contain above 8 characters");
		}
		catch(Exception a) {
			System.out.println("Login successfully");
		}
		System.out.println("end");
	}
	
}
}
