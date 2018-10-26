package com.nissan.trainingcorejava;

interface Printdisplay{
	public void display();
}

public class Lambdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value=100;
Printdisplay p1=() ->{
	System.out.println("Out");
};
p1.display();
}
	}


