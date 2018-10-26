package com.nissan.trainingcorejava;

abstract class Carone{
	abstract void run();
}

public class Abstractexample extends Carone {
	
	void run() {
		System.out.println("Running car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstractexample c =new Abstractexample();
		c.run();
		
	}

}
