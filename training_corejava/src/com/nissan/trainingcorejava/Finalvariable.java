package com.nissan.trainingcorejava;

public class Finalvariable {
	
	final int speedlimit=90;
	
	void run() {
//		speedlimit=100;Final variable can not be replaced or changed
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finalvariable fv= new Finalvariable();
		fv.run();

	}

}
