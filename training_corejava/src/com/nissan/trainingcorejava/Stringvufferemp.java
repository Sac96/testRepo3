package com.nissan.trainingcorejava;

public class Stringvufferemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String emps[]= {"rahul","sam","arun","james","rahul"};
		for(int i=0;i<5;i++) {
			for(int j=i+1;i<5;i++) {
				if(emps[i]==emps[j]) {
					System.out.println("Repeats");
				}
			}
		}
	}

}
