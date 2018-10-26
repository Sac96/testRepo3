package com.nissan.trainingcorejava;


//interface Intmath{
//	void maths();
//	
//}

interface operations{
	void add(int a,int b);
	void subtract(int a,int b);
	void mult(int a,int b);
	default void div(int a,int b) {
		System.out.println(a/b);
	}
}

//class Arioperations implements operations{
//	
//void maths(){
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//	}
//}

public class Mathinterface implements operations {
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public void subtract(int a,int b) {
		System.out.println(a-b);
		
	}
	public void mult(int a,int b) {
		System.out.println(a*b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathinterface i =new Mathinterface();
		i.add(1,2);
		i.subtract(2,1);
		i.mult(4,5);
		i.div(8,2);
		
	}

}
