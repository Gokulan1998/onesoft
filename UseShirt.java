package com.onesoft.collection3;

import java.util.ArrayList;

public class UseShirt {

	public static void main(String[] args) throws Exception {
		Shirt s1=new Shirt();
		s1.brand="Otto";
		s1.price=900;
		s1.color="red";
		s1.size="l";
		Shirt s2=new Shirt();
		s1.brand="Puma";
		s1.price=1900;
		s1.color="blue";
		s1.size="xl";
		Shirt s3=new Shirt();
		s1.brand="Puma";
		s1.price=2500;
		s1.color="White";
		s1.size="xxl";
		ArrayList<Shirt>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		int min=s1.price;
		for(Shirt x:s) {
			if(x.price<min) {
				min=x.price;
			}
		}
	
		if(min>2000) {
			System.out.println(min+"it is very costly");
			System.out.println("very costly");
		}
		else {
					throw new Exception("affordable price");
				}
		
			}

	}


