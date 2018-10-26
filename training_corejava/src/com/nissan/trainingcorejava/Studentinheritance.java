package com.nissan.trainingcorejava;

class Stinheritance{
	void stdetails() {
		System.out.println("Student id is 201");
	}
	
	void stname() {
		System.out.println("Name is Kiran");
	}
}

class Studentdetails extends Stinheritance{
	
}

class Stname extends Studentdetails{
	
}

public class Studentinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stname stdet = new Stname();
		stdet.stname();
		

	}

}
