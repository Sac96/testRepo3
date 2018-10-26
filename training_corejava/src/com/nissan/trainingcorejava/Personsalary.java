package com.nissan.trainingcorejava;

class Person{
int id;
String name;
int age;
Person(){
	id=121;
	name="Sam";
	age=25;
	}
}

class Salary extends Person{
	int sal;
	Salary(int i){
	super();
	sal=i;
	}
	void modify() {
		int s2=sal+super.age*sal/100;
		System.out.println("Employee name:"+name+"\nEid:"+id+"\nUpdated salary:"+s2);
	}
	
}

public class Personsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Salary s = new Salary(1000);
s.modify();
	}

}
