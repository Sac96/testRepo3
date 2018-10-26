package com.nissan.trainingcorejava;
import java.io.FileOutputStream;

public class Filefibinocci {
	
	public static void main(String args[]) {
		
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\fibinocci.txt");
						
			
			int n1=0,n2=1,n3,i,count=10;    
			String cc= (n1+" "+n2);    
			String cx;
			    
			 byte cd[]=cc.getBytes();
			 
				fout.write(cd);
			 for(i=2;i<count;++i) 
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);
			  
			  cx=" "+n3;
			  byte cf[]=cx.getBytes();
			  fout.write(cf);
			  n1=n2;    
			  n2=n3;  
			 }
			 
			
			fout.close();
			 			 
			 
			System.out.println("Done");
			}catch(Exception e){
				System.out.println(e);
			}
	}

}
