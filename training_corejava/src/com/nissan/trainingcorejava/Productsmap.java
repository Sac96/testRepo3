package com.nissan.trainingcorejava;

import java.util.*;
import java.util.Map;
import java.io.*;

public class Productsmap {
	
	static Map<Integer,String> map =new HashMap<Integer,String>();
	static LinkedHashMap<Integer,Integer> map2 =new LinkedHashMap<Integer,Integer>();
	static int k=0;
	static void admin(int i) {
		int c;
		Scanner sc= new Scanner(System.in);
		byte data[];
		FileOutputStream out =null;
		try {
			out = new FileOutputStream("D://a.txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	System.out.println("1.Add\n2.Remove\n3.Add Price\n4.Edit Price");
	c=sc.nextInt();
	switch(c) {
	case 1: System.out.println("Enter product name");
			map.put(i,sc.next());
			break;
	}
	
	
}

void user() {
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5;
		Scanner sc =new Scanner(System.in);
		int c=0, ch;
		do {			
			System.out.println("Enter choice\n1.Admin\n2.User");
			ch=sc.nextInt();
//			if(ch==1) {
//				Productsmap psm=new Productsmap();
//				psm.admin(i);
//			}
//			else {
//				Productsmap psm=new Productsmap();
//				psm.user();
//						
//			}
			
			switch(ch) {
			case 1:admin(i++);
			break;
			
			case 2: user();
			break;
			}
			System.out.println("1 to continue");
			c=sc.nextInt();
		}while(c==1);
		
		
		
sc.close();
	}
}
