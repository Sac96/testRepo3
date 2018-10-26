package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Stringtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ab="";
		if (ab.isEmpty()) {
			System.out.println("The string is empty append a value");
			Scanner input= new Scanner(System.in);
			String data = input.nextLine();
			System.out.println(data);
			input.close();
//			String joinstring = String.join("-", "");
//			
//			System.out.println(joinstring);
		}
		
	}

}
