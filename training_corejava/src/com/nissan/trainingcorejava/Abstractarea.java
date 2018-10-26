package com.nissan.trainingcorejava;

abstract class Shape{
	abstract int area();
}

class Rectangle{
	void area(int l, int b) {
		System.out.println(l*b);
	}
}

class Circle{
	void area(int r) {
		System.out.println(r*3.14);
	}
}

class Square{
	void area(int a) {
		System.out.println(a*a);
	}
}

public class Abstractarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.area(5, 6);
		
		Circle r1 = new Circle();
		r1.area(10);
		
		Square a= new Square();
		a.area(4);

	}

}
