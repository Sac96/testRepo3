package com.nissan.trainingcorejava;


class Car{
	final void run() {
		System.out.println("Car runs");
	}
}

public class Finalvartest extends Car {
	
//	void run() {
//		System.out.println("Again");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalvartest h=new Finalvartest();
		h.run();
	}

}
