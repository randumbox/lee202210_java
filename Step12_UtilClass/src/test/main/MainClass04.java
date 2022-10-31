package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		
		//1
		ArrayList<Car> cars = new ArrayList<>();
		
		//2
		cars.add(new Car("1"));
		cars.add(new Car("2"));
		cars.add(new Car("3"));
		
		//3
		for(Car tmp:cars) {
			tmp.drive();
		}
		System.out.println("good");
		
	}
}
