package com.nissan.trainingcorejava;


abstract class Customer{
	abstract void name();
}

public class Anonymusinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer() {
			void name() {
			System.out.println("Name is shown");	
			}
		};
		c.name();
	}

}
