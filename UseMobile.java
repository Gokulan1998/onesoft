package com.onesoft.collection3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		String []ar0=args[0].split(",");
		String []ar1=args[1].split(",");
		String []ar2=args[2].split(",");
		Mobile m1=new Mobile(ar0[0],Integer.parseInt(ar0[1]),Boolean.parseBoolean(ar0[2]));
		Mobile m2=new Mobile(ar1[0],Integer.parseInt(ar1[1]),Boolean.parseBoolean(ar1[2]));
		Mobile m3=new Mobile(ar2[0],Integer.parseInt(ar2[1]),Boolean.parseBoolean(ar2[2]));
		ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		List<Mobile>android=mobiles.stream().filter(x->x.getIsAndroid()==true).collect(Collectors.toList());
//		android.forEach(x->{
//			x.setPrice(x.getPrice()-999);
//			System.out.println(x);
//		});
		Mobile min=android.stream().min(Comparator.comparing(Mobile::getPrice)).get();
		System.out.println(min);
	}

}
