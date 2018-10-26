package com.nissan.trainingcorejava;

class Parentinst{
	
}

public class Parentchildinstance extends Parentinst {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parentchildinstance i=new Parentchildinstance();
		Parentinst p=new Parentinst();
		System.out.println(p instanceof Parentchildinstance);

	}

}
