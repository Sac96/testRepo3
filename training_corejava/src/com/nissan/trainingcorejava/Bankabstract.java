package com.nissan.trainingcorejava;

abstract class Bankloan{
	abstract void roi(); 
}

class sbi extends Bankloan{
	
	void roi() {
		System.out.println("SBI rate of interest 10%");
	}
}

class hdfc extends Bankloan{
	void roi() {
		System.out.println("HDFC rate of interest 15%");
	}
	
}

public class Bankabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bankloan b = new sbi();
		
		hdfc h = new hdfc();
		sbi s = new sbi();
		h.roi();
		s.roi();

	}

}
