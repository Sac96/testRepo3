package com.nissan.trainingcorejava;

public class Checkgarbage1 {
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	public void test() {
		System.out.println("Checking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checkgarbage1 c1= new Checkgarbage1();
		c1.test();
		c1=null;
		System.gc();
		c1.test();
		

	}

}
