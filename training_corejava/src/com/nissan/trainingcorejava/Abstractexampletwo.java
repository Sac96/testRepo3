package com.nissan.trainingcorejava;

abstract class Cartwo{
	
	Cartwo(){
		System.out.println("this is constructor");
	}
	
	abstract void run();
	
	void gear() {
		System.out.println("change gear");
	}
}

public class Abstractexampletwo {
	
	void run() {
		System.out.println("Running the car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstractexampletwo c= new Abstractexampletwo();
		c.run();
//		c.gear();

	}

}
