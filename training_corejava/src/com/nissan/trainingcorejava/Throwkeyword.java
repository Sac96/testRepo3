package com.nissan.trainingcorejava;

public class Throwkeyword {
	
	static void condition(int number) {
		if(number<10) {
			throw new ArithmeticException("is not valid");
		}
		else {
			System.out.println("Go back");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		condition(8);
		System.out.println("Others..");

	}

}
