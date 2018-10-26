package com.nissan.trainingcorejava;

public class Exceptionhandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num=100/0;
			
			int a[]=new int[5];
			a[5]=30/0;
			
			
		}catch(ArithmeticException e) {
			System.out.println("Task completed");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Task of array completed");
		}
		
		catch(Exception e) {
			System.out.println("Extra stuff");
		}
		
		System.out.println("Other parts of program");
	}

}
