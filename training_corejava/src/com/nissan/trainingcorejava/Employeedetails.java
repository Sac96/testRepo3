package com.nissan.trainingcorejava;

public class Employeedetails {
	
	int employeeid;
	int age;
	String employeeename;

	Employeedetails(int i,int j, String n){
		employeeid=i;
		age=j;
		employeeename=n;
	}
	
	void display() {
		System.out.println(employeeid + "" + employeeename);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeedetails empdetails =  new Employeedetails(101,25,"Kiran");
		empdetails.display();
	}

}
