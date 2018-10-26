package com.nissan.trainingcorejava;

interface Adder1{
	public void display(int a, int b);
}

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Adder1 a1= (int a, int b)->System.out.println("Sum:"+(a+b));
    
    a1.display(10,20);
    a1.display(100, 200);
	}

}
