package com.nissan.trainingcorejava;

class Animals{
	String color="Green";
}

class Cheetahtwo extends Animals{
	
	String color="orange";
	
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Superkeyword {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cheetahtwo cc =new Cheetahtwo();
		cc.displayColor();

	}

}
