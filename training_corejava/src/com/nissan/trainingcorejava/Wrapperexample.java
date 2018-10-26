package com.nissan.trainingcorejava;

public class Wrapperexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		Integer i = Integer.valueOf(x);
		Integer j = x;//autoboxing
		
		//Compiler will write Integer.valueOf(x)
		//internally
		
		System.out.println(x + "" + i+ ""+j);
		
		Integer a= new Integer(3);
		int q = a.intValue();//Converting integer to int
		int w=a;
		
		System.out.println(a + "," + q + ","+w );

	}

}
