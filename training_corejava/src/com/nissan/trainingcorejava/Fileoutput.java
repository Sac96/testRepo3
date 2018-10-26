package com.nissan.trainingcorejava;
import java.io.FileOutputStream;

public class Fileoutput {
	
	public static void main(String args[]) {
		
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\test");
			String a ="Nissan";
			byte b[]=a.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Done");
			}catch(Exception e){
				System.out.println(e);
			}
	}

}
