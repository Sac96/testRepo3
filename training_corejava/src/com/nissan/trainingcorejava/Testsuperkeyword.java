package com.nissan.trainingcorejava;

class Animalss{
	void eating() {
		System.out.println("Animal is eating");
	}
}

class Cheetahss extends Animalss{
	void eating() {
		System.out.println("Eating Deer");
	}
	void roar() {
		System.out.println("is roaring");
	}
	void working() {
		super.eating();
		roar();
	}
	
}

public class Testsuperkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cheetahss cs= new Cheetahss();
		cs.working();

	}

	
}



