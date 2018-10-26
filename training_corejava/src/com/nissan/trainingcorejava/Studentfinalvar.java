package com.nissan.trainingcorejava;

class Studentfinal{
	final String Studs[]= {"Sam","Tam","Pam","Cam"};
	
	void names() {
		for(int i=0;i<4;i++) {
			System.out.println(Studs[i]);
		}
	}
}

public class Studentfinalvar extends Studentfinal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentfinal sf= new Studentfinal();
		sf.names();

	}

}
