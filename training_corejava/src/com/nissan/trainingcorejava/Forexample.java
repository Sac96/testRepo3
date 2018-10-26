package com.nissan.trainingcorejava;

public class Forexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		int numss[]= {1,2,3,4,5,5,4};
		
		
		for(int i=0;i<=7;i++) {
		for(int j=i+1;j<7;j++) {
			if(numss[i]==numss[j]) {
				System.out.println(numss[j]+","+numss);
			}
			
		}
		}

	}

}
