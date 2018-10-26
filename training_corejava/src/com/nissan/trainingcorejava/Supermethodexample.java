package com.nissan.trainingcorejava;

class Animalone{
	Animalone() {
		System.out.println("Animal is eating");
	}
}

class Cheetahone extends Animalone{
	Cheetahone() {
		super();
		System.out.println("Eating Deer");
	}
}

public class Supermethodexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheetahone c = new Cheetahone();

	}

}
