package com.nissan.trainingcorejava;

import java.util.Scanner;


public class Stringcustomer {
	
	String names[]=new String[10]; 
	
	void add() {
		System.out.println("Add the customer name here");
		
		System.out.println("Enter the first name:");
		Scanner fn = new Scanner(System.in);
		String data= fn.nextLine();
		
		System.out.println("Enter the lst name:");
		Scanner ln = new Scanner(System.in);
		String datatwo= ln.nextLine();
		
		String ss= data.concat(" "+datatwo);
		
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
	        System.out.println(ss);
			}
	    }
		
		System.out.println(names[2]);
		
		System.out.println("The customers are\n");
		
	}
	
	void edit() {
		System.out.println("Edit");
		
		System.out.println("The customers are");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	
	void delete() {
		System.out.println("Delete");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the choice\n1.Add the customer\n2.Delete a customer\n3.Edit a customeer");
		ch = sc.nextInt();
		
		Stringcustomer ss =new Stringcustomer();
//		System.out.println(ch);
		switch(ch) {
		   
		   case 1:
		    ss.add();
		    break;
		   case 2:
			   ss.delete();
			   break;
		   case 3:
			   ss.edit();
			   break;
			   
		   	    
		   }
	}

}
