package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Stringnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss= new Scanner(System.in);
		String names[]= {"Rahul","Arun","Kiran","Rahul","Arun"};
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(names[i]==names[j])
				{
					String s= names[j];
					String ns = String.format("Duplicate name found for %s , Please provide last name", s);
					System.out.println(ns);
					
					String cb=(ss.next());
					
					System.out.println("The changed name is "+s+" "+cb);
					names[i]=s+" "+cb;				
				}				
			}
		}
		System.out.println("New list is:");
for(int k=0;k<5;k++) {
	System.out.println(names[k]);
}
ss.close();
	}

}
