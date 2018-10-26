package com.nissan.trainingcorejava;
import java.io.IOException;


public class Testingthrowscl {

	void master() throws IOException{
		throw new IOException("Error has occured");
		
	}
	
	void master2() throws IOException{
		master();
	}

	void master3() {
		try {
			master2();
		}
			catch (Exception e) {
				System.out.println("Error has been handled");// TODO: handle exception
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testingthrowscl obj = new Testingthrowscl();
		obj.master3();
		System.out.println("Other parts");
		
	}

}
