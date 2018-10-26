package com.nissan.trainingcorejava;

interface Stringlambda{
	public void display();
}

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value="Hari";
		Printdisplay p1=() ->{
			System.out.println("Out:"+value);
		};
		p1.display();
		}

	}


