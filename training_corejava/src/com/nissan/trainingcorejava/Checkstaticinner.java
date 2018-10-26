package com.nissan.trainingcorejava;

public class Checkstaticinner {

	static int membervalue=100;
	static class Inner5{
		void displaymember() {
			if(membervalue==100) {
				
			}
			else {
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checkstaticinner.Inner5 obj= new Checkstaticinner.Inner5();
		obj.displaymember();

	}

}
