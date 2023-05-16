package com.onesoft.collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(new Car("Audi","a8",1000000));
		cars.add(new Car("BMW","7 series",2000000));
		cars.add(new Car("Mercedes","AMG",2500000));
		cars.add(new Car("Hyundai","Creta",1500000));
		cars.add(new Car("Tata","Nexon",4000000));
		cars.add(new Car("Tata","Nexon",1200000));
		cars.add(new Car("Tata","Nexon",1200000));
		cars.add(new Car("Mercedes","S class",1800000));
		cars.add(new Car("Renault","Duster",900000));
		cars.add(new Car("Maruti","Swift",800000));
		List<Car>cars1=cars.stream().filter(x->x.getPrice()>1000000).collect(Collectors.toList());
		List<Car>cardetail=cars.stream().filter(y->y.getPrice()>1200000 && y.getPrice()<2000000).collect(Collectors.toList());
		List<Integer>cardetail1=cars.stream().filter(z->z.getBrand().equalsIgnoreCase("mercedes")).map(z->z.getPrice()).collect(Collectors.toList());
		System.out.println(cars1);
		System.out.println(cardetail);
		System.out.println(cardetail1);
	}

}
