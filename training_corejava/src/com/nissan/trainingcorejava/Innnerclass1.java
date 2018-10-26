package com.nissan.trainingcorejava;

public class Innnerclass1 {
	
	private int datavalue=100;
	
	class Inner2{
		
		void message() {
			System.out.println("Value is "+datavalue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Innnerclass1 inner3 = new Innnerclass1();
		Innnerclass1.Inner2 in = inner3.new Inner2();
		
		in.message();

	}

}
