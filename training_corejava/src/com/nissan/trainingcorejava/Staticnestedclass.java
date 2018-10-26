package com.nissan.trainingcorejava;

public class Staticnestedclass {
	
	static int membervalue=100;
	static class Inner4{
		void displaymember() {
			System.out.println("Value is "+membervalue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticnestedclass.Inner4 obj= new Staticnestedclass.Inner4();
		obj.displaymember();
	}

}
