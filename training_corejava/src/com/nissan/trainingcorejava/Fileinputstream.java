package com.nissan.trainingcorejava;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputstream {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileInputStream fin = new FileInputStream("F:\\fibinocci.txt");
			int i=0;
			while((i=fin.read())!=-1) {
				System.out.println((char)i);
				
			}
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
