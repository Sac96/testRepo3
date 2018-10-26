package com.nissan.trainingcorejava;

public class Localinner1 {
	
	private int aa=100;
	void showmessage() {		
	class Localclass1{
		void display() {
			System.out.println(aa);
		}
	}
	Localclass1 I = new Localclass1();
	I.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Localinner1 li=new Localinner1();
		li.showmessage();

	}

}
