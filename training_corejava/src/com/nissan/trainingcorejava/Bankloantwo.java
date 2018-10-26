package com.nissan.trainingcorejava;

class Loan{
	int acno=112;
	String name="Sam";
	int balance =10000;
	int fd=1000;
	
	void check() {
		
	}
}

class loanrates{
	void ratetwo() {
		System.out.println("");
	}
}


class fd extends Loan{
	void rateone(){
		System.out.println("Interest on fd loan is "+balance*10/100);
	}
}


public class Bankloantwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan ln = new Loan();
		
		System.out.println("Current deposit of the account is:"+ln.balance);
		
		fd fd=new fd();
		fd.rateone();
		
		}
}
