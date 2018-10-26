package com.nissan.trainingcorejava;

interface Funone{
	void read();
	interface Funtwo{
		void write();
	}
}

public class Interpal implements Funone.Funtwo {
	
	
	public void write() {
		
	}
	int r,sum=0,temp;    
	  int n=454;

	public void read() {
		   
		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funone.Funtwo n= new Interpal();
		n.write();

	}

}
