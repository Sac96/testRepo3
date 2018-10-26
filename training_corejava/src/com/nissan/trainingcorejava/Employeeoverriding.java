package com.nissan.trainingcorejava;


class Empdetails{
	
	int age;
	int salary;
	
	void details() {
		System.out.println("Age is 50");
	}
}

class Employeeoverriding  extends Empdetails{
	void details() {
		System.out.println("Age is 60");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeeoverriding detil= new Employeeoverriding();
		detil.details();

	}
	
}
