package com.nissan.trainingcorejava;

@FunctionalInterface
interface Speak{
	void speaking();
}

public class Methodreference {
	
	public static void speaksomething() {
		System.out.println("I am static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s = Methodreference::speaksomething;
		s.speaking();

	}

}
