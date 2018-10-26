package com.nissan.trainingcorejava;

import java.util.Arrays;
import java.util.Collections;


public class Prioritytest extends Thread{

	int[] arr= {1,4,5,7,8,4,1};
	String[] names= {"Arun","Sam","Binu"};
	
	public void run() {
		
		if(Thread.currentThread().getPriority()==10) {
		Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
		   	 System.out.println(arr[i]);
		 }
		}
		else {
			System.out.println("Name list:");
			Arrays.sort(names,Collections.reverseOrder());
			for(int i=0;i<3;i++) {
				System.out.println(names[i]+" ");
			}
		}
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prioritytest p1 =new Prioritytest();
		Prioritytest p2 =new Prioritytest();


		p1.setPriority(MAX_PRIORITY);
		p2.setPriority(MIN_PRIORITY);
		p1.start();
		p2.start();

	}

}
