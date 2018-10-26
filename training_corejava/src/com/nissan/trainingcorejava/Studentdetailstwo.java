package com.nissan.trainingcorejava;

public class Studentdetailstwo {

	int studentid;
	String studentname;
	
	Studentdetailstwo(int i, String n){
		this.studentid=i;
		this.studentname=n;
	}
	
	void display() {
		System.out.println(studentid + "" + studentname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentdetailstwo s2 = new Studentdetailstwo(101, " Rahul");
		s2.display();
	}
}
