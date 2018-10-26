package com.nissan.trainingcorejava;

public class Definestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "Nissan";
		//java string literel
		
		char ch =a.charAt(3);
		System.out.println(ch);
		
		int strlen=a.length();
		System.out.println(strlen);
		
		String ns = String.format("name is %s", a);
		System.out.println(ns);
		
		System.out.println(a.substring(2,4));
		
		int indexone= a.indexOf("is");
		System.out.println(indexone);
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.toUpperCase());
		
		String sp = "Hello String ";
		System.out.println(sp+"nissan");
		System.out.println(sp.trim()+"nissan");
		
		String c = "India";
		System.out.println(c.concat(" country"));
		
		String joinstring = String.join("-", "Hello","to","India");
		
		System.out.println(joinstring);
		
		String equalone="nissanone";
		String equaltwo="nissanon";
		
		String empty="";
		String notempty="Not";
		System.out.println(empty.isEmpty());
		System.out.println(notempty.isEmpty());
		
		String sone = new String("Nissan is the company");
		//using new keyword
		
		System.out.println(a);
		System.out.println(sone);
	}

}
